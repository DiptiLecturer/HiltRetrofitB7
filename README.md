# 📱 Retrofit + Hilt Android App

![Kotlin](https://img.shields.io/badge/Kotlin-1.9.22-blue?style=for-the-badge&logo=kotlin)
![Retrofit](https://img.shields.io/badge/Retrofit-2.9.0-green?style=for-the-badge)
![Hilt](https://img.shields.io/badge/Hilt-DI-orange?style=for-the-badge&logo=android)
![Android](https://img.shields.io/badge/Android-App-3DDC84?style=for-the-badge&logo=android)
![License](https://img.shields.io/badge/License-MIT-red?style=for-the-badge)

---

## 🚀 Overview

✨ A modern Android application built using **Kotlin, Retrofit, and Hilt Dependency Injection**.

This project demonstrates how to build a **clean, scalable, and production-style architecture** using FakeStore API.

---

## 🎬 Demo

<p align="center">
  <img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExd3N0dWl1d2J4bWl2dGZ2a2l2bWZ3cWJ2eGJ6dGZ3cWZ2bWZ4a2x5dCZlcD12MV9naWZzX3NlYXJjaCZjdD1n/3o7aD2saalBwwftBIY/giphy.gif" width="300"/>
</p>

---

## 📦 Features

- 📡 Retrofit API integration (FakeStore API)
- 🧠 Hilt Dependency Injection setup
- 🧱 Clean architecture (Repository Pattern)
- 📋 RecyclerView product listing
- 🖼 Glide image loading
- 🌐 Network connectivity check
- ⚡ Beginner-friendly structure

---

## 🏗️ Tech Stack

| Tech | Usage |
|------|------|
| Kotlin | Main language |
| Retrofit | API calls |
| Hilt | Dependency Injection |
| RecyclerView | UI list |
| Glide | Image loading |
| ViewBinding | UI binding |

---

## 🔗 API Used
https://fakestoreapi.com/products
---

## 🧠 Architecture Flow

```text
MainActivity
     ↓
ProductRepository (@Inject)
     ↓
ApiService (Retrofit Interface)
     ↓
Retrofit (Hilt Provided)
     ↓
FakeStore API
