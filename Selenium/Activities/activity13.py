from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:

    driver.get("https://v1.training-support.net/selenium/tables")

    print("Page title is: ", driver.title)

    columns = driver.find_elements(By.XPATH, "//table[contains(@class, 'striped')]/tbody/tr[1]/td")
    print("Number of columns in the given table: ", len(columns))

    rows = driver.find_elements(By.XPATH, "//table[contains(@class, 'striped')]/tbody/tr")
    print("Number of rows in the given table: ", len(rows))

    third_row = driver.find_elements(By.XPATH, "//table[contains(@class, 'striped')]/tbody/tr[3]/td")

    print("Cell values of third row in given table:")
    for row in third_row:
        print(row.text)

    second_row_second_cell = driver.find_element(By.XPATH, "//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]")

    print("Cell value at second row and second column: ", second_row_second_cell.text)