// src/routes/designer/+page.js
export const load = async ({ fetch }) => {
    const res = await fetch('http://localhost:8080/api/designer');
    const designer = await res.json();

    return {
        designer
    };
};