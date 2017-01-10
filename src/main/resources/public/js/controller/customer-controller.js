'use strict';

angular.module('ficovie.customer', [])
  .controller('CustomerController', ['customerService', '$scope', CustomerController]);

function CustomerController (customerService, $scope) {
  var self = this;

  customerService.getCustomer(1).then(function(customer)
  {
    self.customer = customer;
  },function(error){
    alert("error");
  });
};
