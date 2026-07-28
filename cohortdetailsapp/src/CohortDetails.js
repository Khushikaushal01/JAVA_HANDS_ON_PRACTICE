import React from 'react';
import styles from './CohortDetails.module.css';
function CohortDetails({ cohorts }) {
    return (
        <div>
            <h1>Cohort Details Dashboard</h1>
            {cohorts.map(cohort => {
                const headingColor = cohort.status === 'ongoing' ? 'green' : 'blue';
                return (
                    <div key={cohort.id} className={styles.box}>
                        <h3 style={{ color: headingColor }}>{cohort.name}</h3>
                        <dl>
                            <dt>Status</dt>
                            <dd>{cohort.status}</dd>
                            <dt>Start Date</dt>
                            <dd>{cohort.startDate}</dd>
                        </dl>
                    </div>
                );
            })}
        </div>
    );
}
export default CohortDetails;
