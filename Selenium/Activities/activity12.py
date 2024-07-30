from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait

with webdriver.Chrome() as driver:

    driver.get("https://v1.training-support.net/selenium/dynamic-controls")
    wait = WebDriverWait(driver, 10)
    print("Page title is: ", driver.title)

    textbox = driver.find_element(By.ID, "input-text")

    textbox_toggle = driver.find_element(By.ID, "toggleInput")

    print("Text box is enabled: ", textbox.is_enabled())

    textbox_toggle.click()

    print("Text box is enabled: ", textbox.is_enabled())
