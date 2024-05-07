document.addEventListener('DOMContentLoaded', function() {

    // document.getElementById("login").addEventListener('click', function(){
    //     let username = document.querySelector('#uesrid').value;
    //     let password = document.querySelector('#password').value;
    //
    //     let data =
    //         {
    //             username: username,
    //             password: password
    //         };
    //
    //     fetch('http://localhost:8080/member/login', {
    //         method: 'POST',
    //         headers: {'Content-Type': 'application/json'},
    //         body: JSON.stringify(data),
    //     }).then(response => {
    //         if (!response.ok) {
    //             throw new Error('Network response was not ok');
    //         }
    //         return response.json();
    //     }).then(data => {
    //         console.log(data);
    //     }).catch(error => {
    //         console.log('There has been a problem with your fetch operation: ', error.message);
    //     });
    // });

    document.getElementById("regist").addEventListener('click', function(){
        let id = document.querySelector('#id').value;
        let pw = document.querySelector('#pw').value;
        let name = document.querySelector('#name').value;

        let data =
            {
                id: id,
                pw: pw,
                name: name
            };

        fetch('http://localhost:8080/member/regist', {
            method: 'POST',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify(data),
        }).then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            return response.json();
        }).then(data => {
            console.log(data);
            if (data.equals("null")) {
                alert("Áßº¹µÈ ID");
            }
        }).catch(error => {
            console.log('There has been a problem with your fetch operation: ', error.message);
        });
    });



});