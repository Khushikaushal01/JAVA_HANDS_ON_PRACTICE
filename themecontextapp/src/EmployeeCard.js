import React, { useContext } from 'react';
import ThemeContext from './ThemeContext';
function EmployeeCard({ employee }) {
    const theme = useContext(ThemeContext);
    const buttonClass = theme === 'dark' ? 'btn-dark' : 'btn-light';
    return (
        <div style={{ border: '1px solid #ccc', margin: '10px', padding: '10px', width: '200px' }}>
            <h4>{employee.name}</h4>
            <p>Role: {employee.role}</p>
            <button className={buttonClass}>View Details</button>
        </div>
    );
}
export default EmployeeCard;
