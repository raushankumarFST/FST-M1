from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions

with webdriver.Chrome() as driver:

    driver.get("https://v1.training-support.net/selenium/dynamic-controls")
    wait = WebDriverWait(driver, 10)
    print("Page title is: ", driver.title)

    checkbox = driver.find_element(By.ID, "dynamicCheckbox")
    checkbox_toggle = driver.find_element(By.ID, "toggleCheckbox")

    checkbox_toggle.click()
    wait.until(expected_conditions.invisibility_of_element(checkbox))

    checkbox_toggle.click()
    print("Checkbox is visible")

    checkbox.click()
    print("Checkbox is selected")