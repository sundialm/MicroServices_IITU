<#import "base.ftlh" as base>
<@base.layout>
    <div class="container">
        <div class="section-lilac__info">
            <br>
            <br>
            <p>ID: ${item.id}</p>
            <p>Name: ${item.name}</p>
            <p>Description: ${item.description}</p>
            <p>Quantity: ${item.quantity}</p>
            <p>Price: ${item.price}</p>
            <p>Category: ${item.category.category}</p>
            <p>Brand: ${item.brand.brand}</p>
            <img style="width: 200px; height: 200px" src="data:image/jpeg;base64,${item.image}"/>
        </div>

        <h1>You are going to update the product: ${item.name} </h1>

        <form action="/products/${item.id}/update" method="post">
            <label for="">
                Name
                <input name="name" type="text">
            </label>
            <label for="">
                Price
                <input name="price" type="number">
            </label>
            <label for="">
                Description
                <input name="description" type="text">
            </label>
            <label for="">
                Quantity
                <input name="quantity" type="number">
            </label>
            <button class="menu__btn">Update</button>
        </form>
    </div>

</@base.layout>