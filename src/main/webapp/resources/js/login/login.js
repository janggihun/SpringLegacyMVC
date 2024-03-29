/**
 * 
 */



const loginButton = document.getElementById("loginButton")


loginButton.addEventListener("click", function() {


	if (idValidate()) {

		ajaxLogin()
	}

})



function idValidate() {

	let userId = $('#userId').val()

	console.log(userId)

	if (userId.length == 0) {
		alert("id를 입력해주세요")
		return false
	}
	return true;


}


function ajaxLogin() { //수신시 utf 깨지는 문제 발생

	let userId = $('#userId').val()
	let userPw = $('#userPw').val()
	$.ajax({
		type: 'get',
		url: '/login/idPwCheck',
		data: {
			"userId": userId,
			"userPw": userPw
		},
		success: function(result) {

			$("#resultFlag").html(result);

		},
		error: function(error) {   
			console.log(error)
		}
	})

}




