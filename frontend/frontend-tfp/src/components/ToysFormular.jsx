import React, { useState } from 'react';
function ToysFormular() {
    const [statusMessage, setStatusMessage] = useState("");
    function handleSubmit(event) {
        event.preventDefault();
        var formData = new FormData(event.target);
        fetch('http://localhost:8080/toys', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({
                "description": formData.get('description'),
                "price": formData.get('price'),
                "categoryId": formData.get('categoryId'),
                "toyKindId": formData.get('toyKindId'),
            }),
        })
        .then(response => response.json())
        .then(data => {
            setStatusMessage(data.message);
        })
    }

  return (<>
    <form onSubmit={handleSubmit}>
        <h1>Add new toy</h1>
        {statusMessage && <h3 class="toy-add-status">{statusMessage}</h3>}
        <div>
            <label>Name Toy</label>
            <input className="toy-name" type="text" name="description" />
        </div>
        <div>
            <label>Price</label>
            <input className="toy-price" type= "number "name="price" />
        </div>
        <div>
            <label>Toy Kind</label>
            <input className="toy-toy-kind" type= "number " name="toyKindId" />
        </div>
        <div>
            <label>Category</label>
            <input className="toy-category" type= "number "  name="categoryId" />
        </div>
        <button className="add-button">Add</button>
    </form>
    </>
  );
}
export default ToysFormular;