import React, { useState } from 'react';
function Register() {
    const [name, setName] = useState('');
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');

    const handleSubmit = (e) => {
        e.preventDefault();
        if (name.length < 5) {
            alert('Name must be at least 5 characters long!');
            return;
        }
        if (!email.includes('@') || !email.includes('.')) {
            alert('Email must contain "@" and "." symbols!');
            return;
        }
        if (password.length < 8) {
            alert('Password must be at least 8 characters long!');
            return;
        }
        alert('Registration successful!');
    };

    return (
        <div style={{ padding: '20px', border: '1px solid black', width: '450px', margin: '20px auto' }}>
            <h2>Email Registration Form</h2>
            <form onSubmit={handleSubmit}>
                <div style={{ marginBottom: '10px' }}>
                    <label>Name: </label>
                    <input type="text" value={name} onChange={e => setName(e.target.value)} required />
                </div>
                <div style={{ marginBottom: '10px' }}>
                    <label>Email: </label>
                    <input type="text" value={email} onChange={e => setEmail(e.target.value)} required />
                </div>
                <div style={{ marginBottom: '10px' }}>
                    <label>Password: </label>
                    <input type="password" value={password} onChange={e => setPassword(e.target.value)} required />
                </div>
                <button type="submit">Register</button>
            </form>
        </div>
    );
}
export default Register;
