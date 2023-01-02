var login_main = {
    init: function () {
        var _this = this;
        $("#signUpBtn").on('click', function() {
            _this.goSignUpPage();
        });
    },
    goSignUpPage : function() {
        window.location.href = '/signup';
    }
}

login_main.init();
