import React from 'react';
class Cart extends React.Component {
    render() {
        const { itemname, price } = this.props;
        return (
            <tr>
                <td>{itemname}</td>
                <td>{price}</td>
            </tr>
        );
    }
}
class OnlineShopping extends React.Component {
    render() {
        const items = [
            { itemname: 'Laptop', price: 85000 },
            { itemname: 'Smartphone', price: 45000 },
            { itemname: 'Headphones', price: 5000 },
            { itemname: 'Smartwatch', price: 15000 },
            { itemname: 'Keyboard', price: 3000 }
        ];
        return (
            <div>
                <h1>Online Shopping Cart</h1>
                <table border="1" cellPadding="5">
                    <thead>
                        <tr>
                            <th>Item Name</th>
                            <th>Price</th>
                        </tr>
                    </thead>
                    <tbody>
                        {items.map((item, idx) => (
                            <Cart key={idx} itemname={item.itemname} price={item.price} />
                        ))}
                    </tbody>
                </table>
            </div>
        );
    }
}
export default OnlineShopping;
