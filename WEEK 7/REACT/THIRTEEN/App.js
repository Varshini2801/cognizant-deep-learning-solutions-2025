import React, { useState } from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function App() {
  const [view, setView] = useState("book"); // can be book, blog, course
  const [showCourses, setShowCourses] = useState(true); // for && condition

  // Element variable method
  let content;

  if (view === "book") {
    content = <BookDetails books={books} />;
  } else if (view === "blog") {
    content = <BlogDetails blogs={blogs} />;
  } else {
    content = <CourseDetails courses={courses} />;
  }

  // Sample data arrays
  const books = [
    { id: 1, title: "React Explained", author: "Zac Gordon" },
    { id: 2, title: "JavaScript: The Good Parts", author: "Douglas Crockford" }
  ];

  const blogs = [
    { id: 1, title: "Why React Rocks", summary: "A deep dive into React's features." },
    { id: 2, title: "Hooks in Depth", summary: "Understanding useEffect, useState and more." }
  ];

  const courses = [
    { id: 1, name: "React Bootcamp", duration: "3 months" },
    { id: 2, name: "Fullstack Web Dev", duration: "6 months" }
  ];

  return (
    <div style={{ padding: '20px' }}>
      <h1>Blogger App</h1>

      {/* Ternary conditional rendering */}
      <div>
        <button onClick={() => setView("book")}>Books</button>
        <button onClick={() => setView("blog")}>Blogs</button>
        <button onClick={() => setView("course")}>Courses</button>
      </div>

      <hr />

      {/* Element variable method */}
      {content}

      <hr />

      {/* && Conditional Rendering Example */}
      <button onClick={() => setShowCourses(!showCourses)}>
        {showCourses ? "Hide Extra Courses" : "Show Extra Courses"}
      </button>
      {showCourses && <CourseDetails courses={courses} />}
    </div>
  );
}

export default App;
