from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.keys import Keys

with webdriver.Chrome() as driver:
    actions = ActionChains(driver)
    driver.get("https://v1.training-support.net/selenium/input-events")

    print("Page title is: ", driver.title)
    actions = ActionChains(driver)

    actions.send_keys("R").key_down(Keys.CONTROL).send_keys("a").send_keys("c").key_up(Keys.CONTROL).perform()
    driver.close