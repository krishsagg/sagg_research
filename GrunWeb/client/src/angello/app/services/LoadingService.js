angular.module('Grunfoss.Common')
    .service('LoadingService',
        function ($rootScope) {
            var service = this;

            service.setLoading = function(loading) {
                $rootScope.loadingView = loading;
            };
        });
