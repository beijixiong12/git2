angular.module('f3', [])
    .factory('cc', function() {
        var currencies = ['1', '2', '3'],
            usdToForeignRates = {
                USD: 1,
                EUR: 0.74,
                CNY: 6.09
            };
        return {
            currencies: currencies,
            convert: convert
        };

        function convert() {
            return window.alert("你好");
        }
    });