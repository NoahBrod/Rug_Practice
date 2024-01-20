import requests
import random
import os
from PIL import Image

styles = ["traditional", "modern", "transitional", "bohemian"]
sizes = ["area", "runner", "round"]
colors = ["neutral", "bold", "pattern"]
brands = ["reputable", "handmade"]
purposes = ["indoor", "outdoor", "comfort"]
maintenances = ["easy", "low", "high"]

rand_num = 0

for filename in os.listdir("C:/Users/NOJA0/Documents/GitHub/Rug_Practice/python/rug_pics"):
    # image
    img_file = 0
    
    # price
    raw_price = random.randint(20, 200)
    str_price = str(raw_price) + ".99"
    price = float(str_price)
    # style
    rand_num = random.randint(0,3)
    style = styles[rand_num]
    # size
    rand_num = random.randint(0,2)
    size = sizes[rand_num]
    # color
    rand_num = random.randint(0,2)
    color = colors[rand_num]
    # brand
    rand_num = random.randint(0,1)
    brand = brands[rand_num]
    # purpose
    rand_num = random.randint(0,2)
    purpose = purposes[rand_num]
    # maintenance
    rand_num = random.randint(0,2)
    maintenance = maintenances[rand_num]
    
    payload = {
        "price" : price 
        # "style" : style, 
        # "size" : size, 
        # "color" : color, 
        # "brand" : brand, 
        # "purpose" : purpose, 
        # "maintenance" : maintenance
    }
    # filename_str = filename
    # period_num = filename_str.find(".")
    # filename_str = filename_str[:period_num]
    # filename_str = "python/rug_pics/" + filename_str + ".png"
    # img_file =  Image.open("python/rug_pics/" + filename)
    # img_file.save(filename_str)
    with open("C:/Users/NOJA0/Documents/GitHub/Rug_Practice/python/rug_pics/" + filename, 'rb') as file:
        requests.post("http://localhost:8080/api/v1/rug/addRug", data=payload, files={"file": file})
    # break




