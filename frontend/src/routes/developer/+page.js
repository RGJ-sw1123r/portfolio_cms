// src/routes/developer/+page.js
export const load = async ({ fetch }) => {
    const res = await fetch('http://localhost:8080/api/developer');
    const developer = await res.json();

    return {
        developer
    };
};