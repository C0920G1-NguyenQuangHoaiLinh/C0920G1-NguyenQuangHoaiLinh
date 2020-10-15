class Customer {
    constructor(name,idCard,birthday,email,address,typeCustomer,discount,quantityIncluded,rentsDay,service,typeRoom,totalPay) {
        this.name = name;
        this.idCard = idCard;
        this.birthday = birthday;
        this.email = email;
        this.address = address;
        this.typeCustomer = typeCustomer;
        this.discount = discount;
        this.quantityIncluded = quantityIncluded;
        this.rentsDay = rentsDay;
        this.service = service;
        this.typeRoom = typeRoom;
        this.totalPay = totalPay;
    }
    getName(){
        return this.name;
    }
    getIdCard(){
        return this.idCard;
    }
    getBirthday(){
        return this.birthday;
    }
    getEmail(){
        return this.email;
    }
    getAddress(){
        return this.address;
    }
    getTypeCustomer(){
        return this.typeCustomer;
    }
    getDiscount(){
        return this.discount;
    }
    getQuantityIncluded(){
        return this.quantityIncluded;
    }
    getRentsDay(){
        return this.rentsDay;
    }
    getService(){
        return this.service;
    }
    getTypeRoom(){
        return this.typeRoom;
    }
    getTotalPay(){
        return this.totalPay;
    }

    setName(){
        this.name = value;
    }
    setIdCard(){
        this.idCard = value;
    }
    setBirthday(){
        this.birthday = value;
    }
    setEmail(){
        this.email = value;
    }
    setAddress(){
        this.address = value;
    }
    setTypeCustomer(){
        this.typeCustomer = value;
    }
    setDiscount(){
        this.discount = value;
    }
    setQuantityIncluded(){
        this.quantityIncluded = value;
    }
    setRentsDay(){
        this.rentsDay = value;
    }
    setService(){
        this.service = value;
    }
    setTypeRoom(){
        this.typeRoom = value;
    }
    setTotalPay(){
        this.totalPay = value;
    }
}
let arrCustomer = [];
function displayInformation() {
    let temp = '<tr style="border: 2px solid black">'+
        '<th style="border: 2px solid black">Name</th>'+
        '<th style="border: 2px solid black">IdCard</th>'+
        '<th style="border: 2px solid black">Birthday</th>'+
        '<th style="border: 2px solid black">Email</th>'+
        '<th style="border: 2px solid black">Address</th>'+
        '<th style="border: 2px solid black">typeCus</th>'+
        '<th style="border: 2px solid black">QI</th>'+
        '<th style="border: 2px solid black">RentsDay</th>'+
        '<th style="border: 2px solid black">Service</th>'+
        '<th style="border: 2px solid black">TypeRoom</th>'+
        '<th style="border: 2px solid black">TotalPay</th>'+
        '</tr>';
    for (let i in arrCustomer){
        temp += '<tr>'+
            '<td id="10" style="border: 2px solid black">' + arrCustomer[i].getName + '</td>'+
            '<td id="20" style="border: 2px solid black">' + arrCustomer[i].getIdCard() + '</td>'+
            '<td id="30" style="border: 2px solid black">' + arrCustomer[i].getBirthday() + '</td>'+
            '<td id="40" style="border: 2px solid black">' + arrCustomer[i].getEmail() + '</td>'+
            '<td id="50" style="border: 2px solid black">' + arrCustomer[i].getAddress() + '</td>'+
            '<td id="60" style="border: 2px solid black">' + arrCustomer[i].getTypeCustomer() + '</td>'+
            '<td id="70" style="border: 2px solid black">' + arrCustomer[i].getDiscount() + '</td>'+
            '<td id="80" style="border: 2px solid black">' + arrCustomer[i].getQuantityIncluded() + '</td>'+
            '<td id="90" style="border: 2px solid black">' + arrCustomer[i].getRentsDay() + '</td>'+
            '<td id="100" style="border: 2px solid black">' + arrCustomer[i].getService() + '</td>'+
            '<td id="110" style="border: 2px solid black">' + arrCustomer[i].getTypeRoom() + '</td>'+
            '<td id="120" style="border: 2px solid black">' + arrCustomer[i].getTotalPay() + '</td>'+
            '<td><button type="button" onclick="editInformation('+ i + ')">Edit</button></td>'+
            '</tr>';
        document.getElementById("table2").innerHTML = temp;
    }
}
function editInformation(index) {
    let temp = '<tr>' +
        '<td>1.FullName</td>' +
        '<td><input type="text" id="name" value="'+ arrCustomer[index].getName()+'"></td>' +
        '</tr>' +
        '<tr>' +
        '<td>2.IdCard</td>' +
        '<td><input type="number" id="idCard" value="'+ arrCustomer[index].getIdCard()+'"></td>' +
        '</tr>' +
        '<tr>' +
        '<td>3.Birthday</td>' +
        '<td><input type="date" id="birthday" value="'+ arrCustomer[index].getBirthday()+'"></td>' +
        '</tr>' +
        '<tr>' +
        '<td>4.Email</td>' +
        '<td><input type="text" id="email" value="'+ arrCustomer[index].getEmail()+'"></td>' +
        '</tr>' +
        '<tr>' +
        '<td>5.Address</td>' +
        '<td><input type="text" id="address" value="'+ arrCustomer[index].getAddress()+'"></td>' +
        '</tr>' +
        '<tr>' +
        '<td><p>6.TypeCustomer</td>' +
        '<td>' +
        '<select id="typeCustomer" value="'+ arrCustomer[index].getTypeCustomer()+'">' +
        '<option value="Diamond">Diamond</option>' +
        '<option value="Platinum">Platinum</option>' +
        '<option value="Gold">Gold</option>' +
        '<option value="Silver">Silver</option>' +
        '<option value="Member">Member</option>' +
        '</td>' +
        '</tr>' +
        '<tr>' +
        '<td>7.Discount</td>' +
        '<td><input type="text" id="discount" value="'+ arrCustomer[index].getDiscount()+'"></td>' +
        '</tr>' +
        '<tr>' +
        '<td>8.Quantity Included</td>' +
        '<td><input type="text" id="quantityIncluded" value="'+ arrCustomer[index].getQuantityIncluded()+'"></td>' +
        '</tr>' +
        '<tr>' +
        '<td>9.RentsDay</td>' +
        '<td><input type="text" id="rentsDay" value="'+ arrCustomer[index].getRentsDay()+'"></td>' +
        '</tr>' +
        '<tr>' +
        '<td>10.Service</td>' +
        '<td>' +
        '<select id="service" value="'+ arrCustomer[index].getService()+'">' +
        '<option value="Villa">Villa = 500$</option>' +
        '<option value="House">House = 300$</option>' +
        '<option value="Room">Room = 100$</option>' +
        '</td>' +
        '</tr>' +
        '<tr>' +
        '<td>11.TypeRoom</td>' +
        '<td><select id="typeRoom" value="'+ arrCustomer[index].getTypeRoom()+'">' +
        '<option value="Vip">Vip</option>' +
        '<option value="Business">Business</option>' +
        '<option value="Normal">Normal</option>' +
        '</td>' +
        '</tr>' +
        '<tr>' +
        '<td><input type="button" value="Confirm" onclick="editCustomer('+ index +')"></td>' +
        '<td><input type="reset" value="Reset"></td>' +
        '</tr>';
    document.getElementById("table1").innerHTML = temp;
}
function editCustomer(index) {
    arrCustomer[index].setName(document.getElementById("name").value);
    arrCustomer[index].setIdCard(document.getElementById("idCard").value);
    arrCustomer[index].setBirthday(document.getElementById("birthday").value);
    arrCustomer[index].setEmail(document.getElementById("email").value);
    arrCustomer[index].setAddress(document.getElementById("address").value);
    arrCustomer[index].setTypeCustomer(document.getElementById("typeCustomer").value);
    arrCustomer[index].setDiscount(document.getElementById("discount").value);
    arrCustomer[index].setQuantityIncluded(document.getElementById("quantityIncluded").value);
    arrCustomer[index].setRentsDay(document.getElementById("rentsDay").value);
    arrCustomer[index].setService(document.getElementById("service").value);
    arrCustomer[index].setTypeRoom(document.getElementById("typeRoom").value);
    document.getElementById("table1").innerHTML = "";
    displayInformation();
}
