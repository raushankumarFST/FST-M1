from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import Select

with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/selects")
    print("Page title is: ", driver.title)

    multipleSelect_list = driver.find_element(By.ID, "multi-select")
    multipleSelect = Select(multipleSelect_list)

    multipleSelect.select_by_visible_text("Javascript")
 
    for option in multipleSelect.all_selected_options:
        print("Options selected are: ", option.text)

    for x in range(4, 6):
        multipleSelect.select_by_index(x)
    for option in multipleSelect.all_selected_options:
        print("Options selected are: ", option.text)

    multipleSelect.select_by_value("node")
    for option in multipleSelect.all_selected_options:
        print("Options selected are: ", option.text)

    multipleSelect.deselect_by_index(7)
    for option in multipleSelect.all_selected_options:
        print("Options selected are: ", option.text)