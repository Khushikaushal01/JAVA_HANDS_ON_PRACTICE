import React, { useState } from 'react';
function ComplaintRegister() {
    const [name, setName] = useState('');
    const [complaint, setComplaint] = useState('');

    const handleSubmit = (e) => {
        e.preventDefault();
        const refNumber = Math.floor(Math.random() * 1000000);
        alert(`Complaint submitted by ${name}.\nReference Number: ${refNumber}`);
        setName('');
        setComplaint('');
    };

    return (
        <div style={{ padding: '20px', border: '1px solid black', width: '400px', margin: '20px auto' }}>
            <h2>Complaint Register Form</h2>
            <form onSubmit={handleSubmit}>
                <div style={{ marginBottom: '10px' }}>
                    <label>Employee Name: </label>
                    <input type="text" value={name} onChange={e => setName(e.target.value)} required />
                </div>
                <div style={{ marginBottom: '10px' }}>
                    <label>Complaint Description: </label>
                    <textarea value={complaint} onChange={e => setComplaint(e.target.value)} required rows="5" cols="30" />
                </div>
                <button type="submit">Submit Complaint</button>
            </form>
        </div>
    );
}
function App() {
    return (
        <div>
            <ComplaintRegister />
        </div>
    );
}
export default App;
