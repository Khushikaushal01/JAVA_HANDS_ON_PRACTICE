import React from 'react';
import CohortDetails from './CohortDetails';
const mockCohorts = [
    { id: 1, name: 'FSE Java 2026', status: 'ongoing', startDate: '2026-06-01' },
    { id: 2, name: 'AWS Cloud Architect', status: 'completed', startDate: '2026-02-15' },
    { id: 3, name: 'React Native Dev', status: 'ongoing', startDate: '2026-07-01' }
];
function App() {
    return (
        <div>
            <CohortDetails cohorts={mockCohorts} />
        </div>
    );
}
export default App;
