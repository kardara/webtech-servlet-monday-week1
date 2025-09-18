# 📘 Java Servlet Course – Week 1 Recap  

## ✅ What We Covered Today  

### 1. Introduction to Servlets  

- Servlets are Java programs that handle **dynamic web content**.  
- They run inside a **web container** (e.g., Tomcat).  
- Static resources (HTML, CSS, images) are served directly, while dynamic requests are processed by servlets.  
- **web.xml** → configuration file for servlet mappings (URL patterns).  

---

### 2. Eclipse IDE and Tomcat Setup  

- We configured **Eclipse** with **Apache Tomcat** to run and test servlets.  

---

### 3. Servlet Web Project  

- Created a **Dynamic Web Project**.  
- Added an **index.html** form to interact with the servlet.  
- Learned how **action** and **method (GET/POST)** work in forms.  

---

### 4. Creating a Servlet  

- Extend `HttpServlet` class.  
- Use `doGet()` and `doPost()` methods to handle requests.  
- Retrieve form data with `HttpServletRequest`.  
- Send back responses with `HttpServletResponse` using `PrintWriter`.  

---

### 5. HTTP Methods Overview  

- **GET** → fetch data  
- **POST** → send data  
- **PUT** → update entire record  
- **DELETE** → remove data  
- **HEAD** → fetch headers only  
- **PATCH** → partial update  
- **CONNECT** → create connection tunnel  
- **TRACE** → echo request (debugging)  
- **OPTIONS** → show available methods  

---

### 6. RequestDispatcher  

- Forwards a request to another servlet or page (separating logic from presentation).  

---

## 📝 Assignment – Mini Calculator  

Create a simple **Calculator Servlet** with the following:  

### Form (index.html)  

- Input: First Number (number)  
- Input: Second Number (number)  
- Input: Third Number (number)  

### Servlet (CalculatorServlet.java)  

- Add the three numbers together.  
- Display the result.  
- Check if the sum is **even** or **odd**.  

### Example Output  

```txt
The result is 3 and it is an odd number
````

---

## 📌 Submission Guidelines

1. Push your code to **GitHub**.
2. Ensure your repository is **private**.

   - ⚠️ Any public repository will automatically receive a **score of 0**.
3. Add a **screenshot** of the form and the output in your repo.
4. Add us as collaborators:

   - **My GitHub username:** `kardara`
   - **Teacher Patrick’s username:** `dushimimanapatrick@gmail.com`

📎 A link to submit your repo will be provided.

---

### 📅 Deadline

**Due in 3 days – Sunday at 6:00 PM**
