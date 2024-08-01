from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/javascript-alerts")
    print("Page title is: ", driver.title)

    driver.find_element(By.ID, "prompt").click()
    prompt_alert = driver.switch_to.alert

    print(prompt_alert.text)
    prompt_alert.send_keys("Alert message test")

    prompt_alert.accept()