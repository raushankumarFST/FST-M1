from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/target-practice")
    print("Page title is: ", driver.title)

    HeaderText = driver.find_element(By.XPATH, "//h3[@id='third-header']")
    print("Third heading text is: ", HeaderText.text)

    HeaderTextColor = driver.find_element(By.XPATH, "//h5")
    print("Fifth heading colour is: ", HeaderTextColor.value_of_css_property("color"))

    VioletButtonClass = driver.find_element(By.CLASS_NAME, "violet")
    print("Violet button classes are: ", VioletButtonClass.get_attribute("class"))

    GreyButtonText = driver.find_element(By.CLASS_NAME, "grey")
    print("grey button text: ", GreyButtonText.text)

    driver.close()