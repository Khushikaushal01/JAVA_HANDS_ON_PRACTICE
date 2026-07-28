import React, { useState } from 'react';
import ThemeContext from './ThemeContext';
import EmployeesList from './EmployeesList';
const mockEmployees = [
    { id: 1, name: 'Alice Smith', role: 'Developer' },
    { id: 2, name: 'Bob Johnson', role: 'Architect' }
];
function App() {
    const [theme, setTheme] = useState('light');
    return (
        <ThemeContext.Provider value={theme}>
            <div style={{ padding: '20px' }}>
                <h1>Employee Management</h1>
                <button onClick={() => setTheme(prev => prev === 'light' ? 'dark' : 'light')}>
                    Toggle Theme (Current: {theme})
                </button>
                <hr />
                <EmployeesList employees={mockEmployees} />
            </div>
        </ThemeContext.Provider>
    );
}
export default App;
