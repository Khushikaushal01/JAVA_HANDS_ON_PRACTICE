import React from 'react';
import EmployeeCard from './EmployeeCard';
function EmployeesList({ employees }) {
    return (
        <div style={{ display: 'flex', flexWrap: 'wrap' }}>
            {employees.map(emp => (
                <EmployeeCard key={emp.id} employee={emp} />
            ))}
        </div>
    );
}
export default EmployeesList;
