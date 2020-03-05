# Movie Ticket Booking System
Detailed Designing of Movie Ticket Booking System similar to BookMyShow

# Use Cases to be covered:
- As soon as the app is opened, user should be able to view the list of cities where the affiliated cinema are/will be played.
- Each cinema can be run in multiple halls and each hall should run one movie at a time.
- Each movie will have multiple shows.
- User should be able to perform search operation: Search by title, language, genre, release date, city etc.
- If a user selects a movie, system should display cinemas which run the movie and its available shows.
- User should be able to select a show and book tickets.
  - Upon select a cinema hall, User should be shown seating arrangement of the hall.
  - User can select multiple seats as per the preference.
  - Payment gateway has to be made available for successful payment.
- System should show the distinction between available and booked seats.
- No 2 customers or users should be able to book same seat at same time.
- User should be able to cancel the ticket.
- Upon cancellation:
  - the seats should be made available back to the cinema hall
  - the user refund process has to be done successfully
- Notifications should be sent to the user upon successful booking and cancellation of tickets.

# Good to have:
- Discount coupons made available during booking.
- Download movie ticket
- Share movie ticket
- User can provide ratings and feedback:
  - Movie Rating
  - Cinema Hall Rating
  
 # Non Functional Requirement:
 - System should be available to everyone at all times
 - System should be consistent and show accurate results
 - System should handle heavy request flows since many users can login to the system at same time
 - System should be secure

