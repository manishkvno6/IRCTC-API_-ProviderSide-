🚆 IRCTC Ticket Booking REST API (Provider Service)

📌 About This Project

This project is a Spring Boot REST API that works as an IRCTC provider service.
It provides railway ticket booking services to consumer applications such as MakeMyTrip Demo.

The main purpose of this project is to demonstrate how one application can provide services and another application can consume them using REST APIs.

🛠️ Technologies Used

✅ Java 17
✅ Spring Boot
✅ RESTful Web Services
✅ Maven
✅ Swagger UI
✅ Embedded Tomcat Server

🎯 Key Features

✨ Allows users to book railway tickets
✨ Automatically generates a PNR number
✨ Stores ticket information in memory
✨ Provides API to view all booked tickets
✨ Supports JSON-based communication
✨ Easy integration with other applications

🔗 Available APIs
📝 Book Ticket API

This API is used to book a railway ticket.
It accepts passenger details and returns a ticket with PNR and booking status.

📋 Get All Bookings API

This API is used to fetch all booked tickets from the system.

📘 API Documentation (Swagger)

Swagger UI is integrated in this project.
It provides interactive documentation where APIs can be tested easily.

After starting the application, Swagger UI can be accessed from the browser.

⚙️ How This System Works

1️⃣ The consumer application (MakeMyTrip) sends passenger details to IRCTC API.
2️⃣ The IRCTC API processes the request.
3️⃣ A random PNR number is generated.
4️⃣ Ticket details are created and stored in memory.
5️⃣ Booking status is assigned.
6️⃣ The ticket is sent back to the consumer.

This process happens through RESTful communication.

🔄 Consumer Integration (MakeMyTrip)

This project works as a service provider 🏢.

Consumer applications like MakeMyTrip can:

📌 Request ticket booking
📌 Receive ticket confirmation
📌 Fetch booking history
📌 Communicate using JSON format

This makes the system suitable for microservices architecture.

⚠️ Current Limitations

❗ Data is stored only in memory (no database)
❗ PNR range is limited
❗ No login or security system
❗ No payment gateway
❗ Not suitable for production use

This project is mainly for learning and practice.

🚧 Future Improvements

🚀 Add database support
🚀 Implement security with JWT
🚀 Improve ticket availability system
🚀 Add cancellation feature
🚀 Add payment integration
🚀 Deploy using Docker and Cloud


