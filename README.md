# 📘 Java Servlet Course – Week 1 Recap  

## ✅ What We Covered Today  

### 1. Introduction to Servlets  

- Servlets are Java programs that handle **dynamic web content**.  
- They run inside a **web container** (e.g., Tomcat).  
- **Static content** (HTML, CSS, images) is delivered directly, while **dynamic requests** are processed by servlets.  
- **web.xml** → maps URL patterns to servlets.  

---

### 2. Eclipse IDE and Tomcat Setup  

- Configured **Eclipse IDE** with **Apache Tomcat**.  
- Built and tested servlets in a **Dynamic Web Project**.  

---

### 3. Servlet Web Project  

- Created an **index.html** form to send input to servlets.  
- Learned how **action** defines the target servlet and **method (GET/POST)** defines how data is sent.  

---

### 4. Creating a Servlet  

- Extend `HttpServlet`.  
- Override `doGet()` and/or `doPost()` methods.  
- Use:  
  - `HttpServletRequest` → read form data.  
  - `HttpServletResponse` → write output to the browser.  
- Example: `PrintWriter out = response.getWriter();`  

---

### 5. HTTP Methods Overview  

- **GET** → fetch data  
- **POST** → send data  
- **PUT** → update  
- **DELETE** → remove  
- **HEAD** → retrieve headers  
- **PATCH** → partial update  
- **CONNECT** → open tunnel  
- **TRACE** → echo request (debugging)  
- **OPTIONS** → list available methods  

---

### 6. RequestDispatcher  

- Forward a request from one servlet to another servlet/JSP/HTML.  
- Useful to separate **logic** (servlet) and **presentation** (JSP/HTML).  

---

## 📝 Class Assignment (Recap – What We Did in Class)  

We created a **Mini Calculator**:  

### Form (index.html)  

- Input: First Number  
- Input: Second Number  
- Input: Third Number  

### Servlet (CalculatorServlet.java)  

- Add the three numbers.  
- Print the result.  
- Check whether the sum is **even or odd**.  

#### Example Output  

```txt
The result is 3 and it is an odd number
````

---

## 📝 Assignment (New Challenge – Due in 3 Days)

Extend your knowledge with a slightly more complex project:

### Task – Advanced Calculator with Age Check

1. Create a form with:

   - First Number
   - Second Number
   - Age

2. In the servlet:

   - Compute the **sum** of the two numbers.
   - Check if the **sum > 100** → display `"Big number!"`.
   - Otherwise, display `"Small number!"`.
   - Add an **age check**:

     - If age ≥ 18 → `"You are adult"`
     - Else → `"You are minor"`

#### Example Output

```txt
The result is 120 → Big number!
You are adult.
```

---

## 📌 Submission Guidelines

1. Push your code to **GitHub**.
2. Make sure your repository is **private**.

   - ⚠️ Any **public repository** will automatically receive a **score of 0**.
3. Add a **screenshot of your form and output** in the repo.
4. Add us as collaborators:

   - **My GitHub username:** `kardara`
   - **Teacher Patrick’s username:** `dushimimanapatrick@gmail.com`

📎 A link to submit your repo will be provided.

---

### 📅 Deadline

**Due in 3 days – Sunday at 6:00 PM**
