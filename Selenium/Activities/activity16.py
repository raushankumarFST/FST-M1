from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions

with webdriver.Chrome() as driver:
    wait = WebDriverWait(driver, 10)

    driver.get("https://v1.training-support.net/selenium/dynamic-attributes")
    print("Page title is: ", driver.title)

    username = driver.find_element(By.XPATH, "//input[contains(@class, '-username')]")
    password = driver.find_element(By.XPATH, "//input[contains(@class, '-password')]")
    confirm_password = driver.find_element(By.XPATH, "//label[contains(text(), 'Confirm Password')]//following::input")

    email = driver.find_element(By.XPATH, "//input[contains(@class, 'email-')]")

    username.send_keys("admin")
    password.send_keys("test")
    confirm_password.send_keys("test")
    email.send_keys("abc@xyz.com")

    driver.find_element(By.XPATH, "//button[text()='Sign Up']").click()

    wait.until(expected_conditions.visibility_of_element_located((By.ID, "action-confirmation")))

    message = driver.find_element(By.ID, "action-confirmation").text
    print("LogIn message: ", message)
