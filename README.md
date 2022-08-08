# book-ui
UI service that integrates with a Management service's API utilizing a Jax-RS Client.
As a book collector I want the ability to create, and keep up to date, a catalogue of all my books. The catalogue service should provide a list of all catalogued books from where I need to be able to add new books, update existing information of books and remove books.


## Requirements

**1. Expose a Rest Api for the following actions:**
- List 
- Add
- Update
- Delete


**2. Utilise an in-memory DB to support the above-mentioned operations.**
- Book data required:
- Name
- ISBN Number
- Publish date (dd/MM/yyyy)
- Price (ZAR)
- Book Type (Hard Cover, Soft Cover, eBook, etc.)

**3. Technical:**
- Spring Boot 2 Web application
- Java version: 1.8
- Maven project
- JSP/JS 


## Getting Started

**1. Clone the application**

```bash
git clone https://github.com/AneleChila/book-ui.git
```
**2. Build the application**

```bash
mvn clean install
```

**3. Run the application**

```bash
mvn spring-boot:run
```
## Demo

**1. Init page: Add Book Page**

```bash
http://localhost:8081/open-add-book-form
```
[Insert title here.webm](https://user-images.githubusercontent.com/40594521/183520687-5c16f2dc-e57c-4015-b3ab-f2591a276e1f.webm)
