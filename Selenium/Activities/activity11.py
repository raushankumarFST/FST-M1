from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait

with webdriver.Chrome() as driver:

    driver.get("https://v1.training-support.net/selenium/dynamic-controls")
    wait = WebDriverWait(driver, 10)

    print("Home Page title is: ", driver.title)

    checkbox = driver.find_element(By.XPATH, "//input[@type='checkbox']")
    print("Checkbox is selected: ", checkbox.is_selected())

    checkbox.click()
    print("Checkbox is selected: ", checkbox.is_selected())