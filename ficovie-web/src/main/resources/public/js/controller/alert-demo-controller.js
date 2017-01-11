'use strict';

angular.module('ficovie.bootstrap', [])
  .controller('AlertDemoCtrl', ['$scope', AlertDemoCtrl]);

  function AlertDemoCtrl ($scope) {
    var self = this;

    self.alerts = [
      { type: 'danger', msg: 'Oh snap! Change a few things up and try submitting again.' },
      { type: 'success', msg: 'Well done! You successfully read this important alert message.' }
    ];

    self.addAlert = function() {
      self.alerts.push({msg: 'Another alert!'});
    };

    self.closeAlert = function(index) {
      self.alerts.splice(index, 1);
    };
  };
