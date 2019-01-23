angular.module('invoice2', ['finance2','f3'])
    .controller('InvoiceController', ['currencyConverter','cc', function(currencyConverter,cc) {
        this.qty = 1;
        this.cost = 2;
        this.inCurr = '1';
        this.currencies = cc.currencies;

        this.total = function total(outCurr) {
            return cc.convert(this.qty * this.cost, this.inCurr, outCurr);
        };
        this.pay = function pay() {
            window.alert("谢谢！");
        };
    }]);