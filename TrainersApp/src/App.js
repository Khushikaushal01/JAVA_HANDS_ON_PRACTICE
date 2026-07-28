import React from 'react';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import Home from './Home';
import TrainersList from './TrainersList';
import TrainerDetail from './TrainerDetails';
import { trainers } from './TrainersMock';
function App() {
    return (
        <Router>
            <div>
                <nav>
                    <Link to="/" style={{ marginRight: '10px' }}>Home</Link>
                    <Link to="/trainers">Trainers List</Link>
                </nav>
                <hr />
                <Routes>
                    <Route path="/" element={<Home />} />
                    <Route path="/trainers" element={<TrainersList trainers={trainers} />} />
                    <Route path="/trainers/:id" element={<TrainerDetail />} />
                </Routes>
            </div>
        </Router>
    );
}
export default App;
