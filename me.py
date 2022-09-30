import pandas as pd 
data = pd.read_csv("C:/Users/Lenovo/Desktop/ICP Project/airports.csv")
new_data = data.to_string()
print(new_data)
