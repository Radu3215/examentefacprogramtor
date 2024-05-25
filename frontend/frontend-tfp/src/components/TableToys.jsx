import React, { useEffect, useState } from 'react';
function TableToys() {

    const [toys, setToys] = useState([])


    useEffect(function() {
        fetch('http://localhost:8080/toys')
        .then(response => response.json())
        .then(data => {
            setToys(data);
            console.log(data);
        })
    }, [])
    return (
        <div>
         <h1>List of Toys</h1>
         <table>
            <thead>
                <tr>
                    <th>Toy ID</th>
                    <th>Description</th>
                    <th>Price</th>
                </tr>
            </thead>
            <tbody>
                {toys.map((toy) => (
                    <tr>
                        <td>{toy.toyId}</td>
                        <td>{toy.description}</td>
                        <td>{toy.price}</td>
                    </tr>
                ))}
            </tbody>
        </table>

        </div>
    );
}

export default TableToys;