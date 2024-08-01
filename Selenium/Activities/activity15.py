from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions

with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/dynamic-attributes")
    wait = WebDriverWait(driver, 10)

    print("Home Page title is: ", driver.title)

    username = driver.find_element(By.XPATH, "//input[starts-with(@class, 'username-')]")
    password = driver.find_element(By.XPATH, "//input[starts-with(@class, 'password-')]")

    username.send_keys("admin")
    password.send_keys("password")
    driver.find_element(By.XPATH, "//button[@type='submit']").click()

    wait.until(expected_conditions.visibility_of_element_located((By.ID, "action-confirmation")))

    message = driver.find_element(By.ID, "action-confirmation").text
    print("Login message: ", message)