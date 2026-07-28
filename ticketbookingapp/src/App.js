import React, { useState } from 'react';
function GuestPage() {
    return (
        <div>
            <h2>Guest Page</h2>
            <p>Please log in to book flight tickets.</p>
            <p>Available Flights: NY-101, CH-204, DE-305</p>
        </div>
    );
}
class UserPage extends React.Component {
    render() {
        return (
            <div>
                <h2>Welcome back, Registered User!</h2>
                <button onClick={() => alert('Ticket Booked successfully!')}>Book Ticket Now</button>
            </div>
        );
    }
}
function App() {
    const [isLoggedIn, setIsLoggedIn] = useState(false);
    return (
        <div style={{ padding: '20px' }}>
            <h1>Flight Ticket Booking Portal</h1>
            {isLoggedIn ? <UserPage /> : <GuestPage />}
            <hr />
            {isLoggedIn ? (
                <button onClick={() => setIsLoggedIn(false)}>Logout</button>
            ) : (
                <button onClick={() => setIsLoggedIn(true)}>Login</button>
            )}
        </div>
    );
}
export default App;
