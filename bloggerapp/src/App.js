import React, { useState } from 'react';
function BookDetails() {
    return (
        <div>
            <h3>Book Details</h3>
            <p>Book Title: React Core Fundamentals</p>
            <p>Author: Jane Miller</p>
        </div>
    );
}
function BlogDetails() {
    return (
        <div>
            <h3>Blog Details</h3>
            <p>Post: The Virtual DOM explained.</p>
            <p>Author: Bob Architect</p>
        </div>
    );
}
function CourseDetails() {
    return (
        <div>
            <h3>Course Details</h3>
            <p>Course: Spring Boot and Microservices FSE</p>
            <p>Provider: Cognizant Academy</p>
        </div>
    );
}
function App() {
    const [view, setView] = useState('book');
    return (
        <div style={{ padding: '20px' }}>
            <h1>Blogger Dashboard</h1>
            <div>
                <button onClick={() => setView('book')}>Book Details</button>
                <button onClick={() => setView('blog')} style={{ marginLeft: '10px' }}>Blog Details</button>
                <button onClick={() => setView('course')} style={{ marginLeft: '10px' }}>Course Details</button>
            </div>
            <hr />
            {view === 'book' && <BookDetails />}
            {view === 'blog' && <BlogDetails />}
            {view === 'course' && <CourseDetails />}
        </div>
    );
}
export default App;
