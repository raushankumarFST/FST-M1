from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions
with webdriver.Chrome() as driver:

    driver.get("https://v1.training-support.net/selenium/ajax")
    print("Home page title: ", driver.title)

    wait = WebDriverWait(driver, 10)

    driver.find_element(By.xpath("//button[text()='Change Content']")).click()
 
    wait.until(expected_conditions.text_to_be_present_in_element((By.TAG_NAME, "h1"), "HELLO!"))
    message1 = driver.find_element(By.TAG_NAME, "h1").text
    print(message1)

    wait.until(expected_conditions.text_to_be_present_in_element((By.TAG_NAME, "h3"), "I'm late!"))
    message2 = driver.find_element(By.TAG_NAME, "h3").text

    print(message2)