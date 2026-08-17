# Spring Boot 練習

本 Repository 為學習 Spring Boot 過程的實作練習，參考《Spring Boot 零基礎入門：從零到專案開發，古古代你輕鬆上手》的實作範例。

## 開發環境
* **Language:** Java 21
* **Framework:** Spring Boot 4.1.0
* **IDE:** IntelliJ IDEA
* **Build Tool:** Maven

## 練習內容
- [Ch05 IoC](#Ch05-IoC)

---

### Ch05 IoC
* `Printer` : 定義印表機需要用 `print()` 列印
* `HpPrinter` / `CanonPrinter` : 不同品牌的印表機
* `Teacher` : 使用 Printer 來執行列印

實作練習: Spring 有二台印表機 HpPinter 和 CanonPrinter，`Teacher` 跟 Spring 借一台印表機列印。