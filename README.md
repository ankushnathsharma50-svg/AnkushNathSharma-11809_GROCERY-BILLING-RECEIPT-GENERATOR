# AnkushNathSharma-11809_GROCERY-BILLING-RECEIPT-GENERATOR
A simple Grocery Billing Receipt Generator built using Java and Object-Oriented Programming concepts.

# 🛒 Grocery Billing Receipt Generator

## 📌 Overview
This project is a Grocery Billing Receipt Generator developed using Core Java and Object-Oriented Programming (OOP) concepts. It simulates a real-world retail billing system that calculates total cost, applies tax, and generates a formatted receipt.

---

## 🚀 Features
- Add multiple grocery items
- Calculate total price automatically
- Apply tax (GST)
- Generate clean and structured receipt
- Uses efficient string handling with StringBuilder

---

## 🧩 OOP Concepts Used
- Classes and Objects
- Encapsulation
- Aggregation (Bill contains multiple Items)
- Method abstraction

---

## 🏗️ Project Structure
- `Item` class → stores item name, price, quantity  
- `Bill` class → manages items, calculates total, generates receipt  
- `Main` class → runs the program  

---

## ⚙️ How It Works
1. User inputs item details  
2. Items are stored as objects  
3. Total cost is calculated  
4. Tax is applied  
5. Receipt is generated and displayed  

---

## 🖥️ Sample Output
====================================
       GROCERY BILL RECEIPT
====================================
Item            Price    Qty      Total
Rice            50.00    2        100.00
Sugar           40.00    1        40.00
Milk            30.00    3        90.00
------------------------------------
Subtotal : ₹230.00
GST (5%) : ₹11.50
Total    : ₹241.50
====================================
   Thank You For Shopping With Us!
====================================
