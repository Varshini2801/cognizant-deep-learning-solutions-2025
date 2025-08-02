import React from 'react';

const BlogDetails = ({ blogs }) => {
  return (
    <div>
      <h2>Blog Posts</h2>
      <ul>
        {blogs.map(blog => (
          <li key={blog.id}>
            <strong>{blog.title}</strong> - {blog.summary}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default BlogDetails;
