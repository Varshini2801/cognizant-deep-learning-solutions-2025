import React from 'react';

const CourseDetails = ({ courses }) => {
  return (
    <div>
      <h2>Course List</h2>
      <ul>
        {courses.map(course => (
          <li key={course.id}>
            <strong>{course.name}</strong> - Duration: {course.duration}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default CourseDetails;
