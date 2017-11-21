var app = angular.module('ngdemoApp.controllers', []);




app.controller('RedirectURLCtrl', function($scope, $window) {
	$scope.RedirectToURL = function() {
		var landingUrl = "http://" + $window.location.host + "/Unidocentes/views/Bitacora.html";
		
        $window.location.href = landingUrl;
		//$window.location.href = "Bitacora.html"
    };
    
})
var landingUrl = "http://" + $window.location.host + "/Unidocentes/views/Microcurriculos.html";
                            $window.location.href= "landingUrl";

//app.controller('RedirectURLCtrl', function($scope, $window) {
//	$scope.RedirectToURL = function() {
//		var landingUrl = "http://" + $window.location.host + "/Unidocentes/views/Microcurriculos.html";
//		
//        $window.location.href = landingUrl;
//		//$window.location.href = "Bitacora.html"
//    };
    
//})
//;app.controller('RedirectURLCtrl', function($scope, $window) {
//	$scope.RedirectToURL = function() {
//		 
//		var landingUrl = "http://" + $window.location.host + "/Unidocentes/#!/index.html";
//		
//        $window.location.href = landingUrl;
//		//$window.location.href = "Bitacora.html"
//    };
//});






/* Controller Asignatura */
app.controller('AsignaturasListCtrl', ['$scope', 'AsignaturasFactory', 'AsignaturaFactory', '$location',
	function ($scope, AsignaturaFactory, AsignaturaFactory, $location) {

	/* callback for ng-click 'remove': */
	$scope.removeAsignatura= function (idAsignatura) {
		AsignaturaFactory.delete({ id: idAsignatura });
		$scope.asignatura = AsignaturasFactory.query();
	};

	/* callback for ng-click 'save': */
	$scope.createNewAsignatura = function () {
		$location.path('/asignatura-creation');
	};

	$scope.asignaturas = AsignaturasFactory.query();
}]);

app.controller('ASignaturaCreationCtrl', ['$scope', 'AsignaturasFactory', '$location',
	function ($scope, AsignaturasFactory, $location) {

	/* callback for ng-click 'save': */
	$scope.createNewAsignatura = function () {
		ProgramasFactory.create($scope.asignatura);
	};

	$scope.asignaturas = AsignaturasFactory.query();
}]);


/* Bibliografia */

app.controller('BibliografiaListCtrl', ['$scope', 'BibliografiasFactory', 'BibliografiaFactory', '$location',
	function ($scope, ProgramasFactory, ProgramaFactory, $location) {

	/* callback for ng-click 'remove': */
	$scope.removeBibliografia = function (idBibliografia) {
		BibliografiaFactory.delete({ id: idBibliografia });
		$scope.bibliografias = BibliografiasFactory.query();
	};

	/* callback for ng-click 'save': */
	$scope.createNewBibliografia = function () {
		$location.path('/bibliografia-creation');
	};

	$scope.bibliografias = BibliografiasFactory.query();
}]);

app.controller('BibliografiaCreationCtrl', ['$scope', 'BibliografiasFactory', '$location',
	function ($scope, BibliografiasFactory, $location) {

	/* callback for ng-click 'save': */
	$scope.createNewBibliografia = function () {
		BibliografiasFactory.create($scope.bibliografia);
	};

	$scope.bibliografias = BibliografiasFactory.query();
}]);


/* ////////////////////BITACORAS/////////////////////////// */
app.controller('BitacoraListCtrl', ['$scope', 'BitacorasFactory', 'BitacoraFactory', '$location',
	function ($scope, ProgramasFactory, ProgramaFactory, $location) {

	/* callback for ng-click 'remove': */
	$scope.removeBitacora = function (idBitacora) {
		BitacoraFactory.delete({ id: idBitacora });
		$scope.bitacoras = BitacorasFactory.query();
	};

	/* callback for ng-click 'save': */
	$scope.createNewBitacora = function () {
		$location.path('/bitacora-creation');
	};

	$scope.bitacoras = BitacorasFactory.query();
}]);

app.controller('BitacoraCreationCtrl', ['$scope', 'BitacorasFactory', '$location',
	function ($scope, BitacorasFactory, $location) {

	/* callback for ng-click 'save': */
	$scope.createNewBitacora = function () {
		BitacorasFactory.create($scope.bitacora);
	};

	$scope.bitacoras = BitacorasFactory.query();
}]);

/* ////////////////////DOCENTE/////////////////////////// */

app.controller('DocenteListCtrl', ['$scope', 'DocentesFactory', 'DocenteFactory', '$location',
	function ($scope, DocentesFactory, DocenteFactory, $location) {

	/* callback for ng-click 'remove': */
	$scope.removeDocente = function (idDocente) {
		DocenteFactory.delete({ id: idDocente });
		$scope.Docentes = DocentesFactory.query();
	};

	/* callback for ng-click 'save': */
	$scope.createNewDocente = function () {
		$location.path('/docente-creation');
	};

	$scope.docentes = DocentesFactory.query();
}]);

app.controller('DocenteCreationCtrl', ['$scope', 'DocentesFactory', '$location',
	function ($scope, DocentesFactory, $location) {

	/* callback for ng-click 'save': */
	$scope.createNewDocente = function () {
		DocentesFactory.create($scope.docente);
	};

	$scope.docente = DocentesFactory.query();
}]);


/* ////////////////////ESTADO MICRO CUR/////////////////////////// */
app.controller('EstadoMicroListCtrl', ['$scope', 'EstadoMicrosFactory', 'EstadoMicroFactory', '$location',
	function ($scope, EstadoMicrosFactory, EstadoMicroFactory, $location) {

	/* callback for ng-click 'remove': */
	$scope.removeEstadoMicro = function (idEstadoMicro) {
		EstadoMicroFactory.delete({ id: idEstadoMicro});
		$scope.EstadoMicros = EstadoMicrosFactory.query();
	};

	/* callback for ng-click 'save': */
	$scope.createNewEstadoMicro = function () {
		$location.path('/estadoMicro-creation');
	};

	$scope.estadoMicro = EstadoMicrosFactory.query();
}]);

app.controller('ProgramaCreationCtrl', ['$scope', 'EstadoMicrosFactory', '$location',
	function ($scope, EstadoMicrosFactory, $location) {

	/* callback for ng-click 'save': */
	$scope.createNewEstadoMicro = function () {
		EstadoMicrosFactory.create($scope.estadoMicro);
	};

	$scope.EstadoMicros = EstadoMicrosFactory.query();
}]);


/* ////////////////////ESTADO USUARIO/////////////////////////// */
app.controller('EstadousuarioListCtrl', ['$scope', 'EstadousuarioFactory', 'EstadousuariosFactory', '$location',
	function ($scope, EstadousuariosFactory, EstadousuarioFactory, $location) {

	/* callback for ng-click 'remove': */
	$scope.removeEstadousuario = function (idEstadousuario) {
		EstadousuarioFactory.delete({ id: idEstadousuario });
		$scope.estadousuario = EstadousuariosFactory.query();
	};

	/* callback for ng-click 'save': */
	$scope.createNewEstadousuario = function () {
		$location.path('/estadousuario-creation');
	};

	$scope.estadousuario = RolFactory.query();
}]);

app.controller('EstadousuarioCreationCtrl', ['$scope', 'EstadousuariosFactory', '$location',
	function ($scope, EstadousuariosFactory, $location) {

	/* callback for ng-click 'save': */
	$scope.createNewEstadousuario = function () {
		EstadousuariosFactory.create($scope.estadousuario);
	};

	$scope.Estadousuario = EstadousuariosFactory.query();
}]);

/* ////////////////////ESTRATEGIA/////////////////////////// */

app.controller('EstrategiaListCtrl', ['$scope', 'EstrategiasFactory', 'EstrategiaFactory', '$location',
	function ($scope, EstrategiasFactory, EstrategiaFactory, $location) {

	/* callback for ng-click 'remove': */
	$scope.removeEstrategia = function (idEstrategia) {
		EstrategiaFactory.delete({ id: idEstrategia });
		$scope.estrategias = EstrategiasFactory.query();
	};

	/* callback for ng-click 'save': */
	$scope.createNewEstrategia = function () {
		$location.path('/estrategia-creation');
	};

	$scope.estrategias = EstrategiasFactory.query();
}]);

app.controller('EstrategiaCreationCtrl', ['$scope', 'EstrategiasFactory', '$location',
	function ($scope, EstrategiasFactory, $location) {

	/* callback for ng-click 'save': */
	$scope.createNewEstrategia = function () {
		EstrategiasFactory.create($scope.estrategia);
	};
	$scope.estrategia = EstrategiasFactory.query();
}]);


/* ////////////////////EVALUACIONES/////////////////////////// */


app.controller('EvaluacionListCtrl', ['$scope', 'EvaluacionesFactory', 'EvaluacionFactory', '$location',
	function ($scope, EvaluacionsFactory, EvaluacionFactory, $location) {

	/* callback for ng-click 'remove': */
	$scope.removeEvaluacion = function (idEvaluacion) {
		EvaluacionFactory.delete({ id: idEvaluacion });
		$scope.evaluaciones = EvaluacionesFactory.query();
	};

	/* callback for ng-click 'save': */
	$scope.createNewEvaluacion = function () {
		$location.path('/evaluacioncreation');
	};

	$scope.evaluaciones = EvaluacionFactory.query();
}]);

app.controller('EvaluacionCreationCtrl', ['$scope', 'EvaluacionesFactory', '$location',
	function ($scope, EvaluacionesFactory, $location) {

	/* callback for ng-click 'save': */
	$scope.createNewEvaluacion = function () {
		EvaluacionesFactory.create($scope.evaluacion);
	};

	$scope.Evaluacions = EvaluacionsFactory.query();
}]);
/* ////////////////////FUNCIONES/////////////////////////// */

app.controller('FuncionListCtrl', ['$scope', 'FuncionesFactory', 'FuncionFactory', '$location',
	function ($scope, FuncionesFactory,FuncionFactory, $location) {

	/* callback for ng-click 'remove': */
	$scope.removeFuncion = function (idFuncion) {
		FuncionFactory.delete({ id: idFuncion });
		$scope.funciones = PFuncionesFactory.query();
	};

	/* callback for ng-click 'save': */
	$scope.createNewFuncion = function () {
		$location.path('/funcion-creation');
	};

	$scope.funciones = FuncionesFactory.query();
}]);

app.controller('FuncionCreationCtrl', ['$scope', 'FuncionesFactory', '$location',
	function ($scope, FuncionesFactory, $location) {

	/* callback for ng-click 'save': */
	$scope.createNewFuncion = function () {
		FuncionesFactory.create($scope.funcion);
	};

	$scope.funciones = FuncionesFactory.query();
}]);


/* ////////////////////HISTORIALES/////////////////////////// */
app.controller('HistorialListCtrl', ['$scope', 'HistorialesFactory', 'HistorialFactory', '$location',
	function ($scope, HistorialesFactory, HistorialFactory, $location) {

	/* callback for ng-click 'remove': */
	$scope.removeHistorial = function (idHistorial) {
		HistorialFactory.delete({ id: idHistorial });
		$scope.historiales = HistorialesFactory.query();
	};

	/* callback for ng-click 'save': */
	$scope.createNewHistoriales = function () {
		$location.path('/historial-creation');
	};

	$scope.historiales = HistorialesFactory.query();
}]);

app.controller('HistorialCreationCtrl', ['$scope', 'HistorialesFactory', '$location',
	function ($scope, HistorialesFactory, $location) {

	/* callback for ng-click 'save': */
	$scope.createNewHistorial = function () {
		HistorialesFactory.create($scope.historial);
	};

	$scope.historiales = HistorialesFactory.query();
}]);
/*
 * ////////////////////INFORMACION * ADICIONAL///////////////////////////
 */
app.controller('HistorialListCtrl', ['$scope', 'HistorialesFactory', 'HistorialFactory', '$location',
	function ($scope, HistorialesFactory, HistorialFactory, $location) {

	/* callback for ng-click 'remove': */
	$scope.removeHistorial = function (idHistorial) {
		HistorialFactory.delete({ id: idHistorial });
		$scope.historiales = HistorialesFactory.query();
	};

	/* callback for ng-click 'save': */
	$scope.createNewHistoriales = function () {
		$location.path('/historial-creation');
	};

	$scope.historiales = HistorialesFactory.query();
}]);

app.controller('HistorialCreationCtrl', ['$scope', 'HistorialesFactory', '$location',
	function ($scope, HistorialesFactory, $location) {

	/* callback for ng-click 'save': */
	$scope.createNewHistorial = function () {
		HistorialesFactory.create($scope.historial);
	};

	$scope.historiales = HistorialesFactory.query();
}]);


/*
 * ////////////////////LENGUAJE CONTROLLER///////////////////////////
 */
app.controller('LenguajeListCtrl', ['$scope', 'LenguajesFactory', 'LenguajeFactory', '$location',
	function ($scope, LenguajesFactory, LenguajeFactory, $location) {

	/* callback for ng-click 'remove': */
	$scope.removeLenguaje = function (idLenguaje) {
		LenguajeFactory.delete({ id: idLenguaje });
		$scope.lenguajes = LenguajesFactory.query();
	};

	/* callback for ng-click 'save': */
	$scope.createNewLenguaje = function () {
		$location.path('/lenguaje-creation');
	};

	$scope.lenguajes = LenguajesFactory.query();
}]);

app.controller('LenguajeCreationCtrl', ['$scope', 'LenguajesFactory', '$location',
	function ($scope, LenguajesFactory, $location) {

	/* callback for ng-click 'save': */
	$scope.createNewLenguaje = function () {
		LenguajesFactory.create($scope.lenguaje);
	};

	$scope.lenguaje = LenguajesFactory.query();
}]);


/*
 * ////////////////////MICROCURRICULO///////////////////////////
 */
app.controller('MicrocurriculoListCtrl', ['$scope', 'MicrocurriculoSFactory', 'MicrocurriculoFactory', '$location',
	function ($scope, MicrocurriculosFactory, MicrocurriculoFactory, $location) {

	/* callback for ng-click 'remove': */
	$scope.removeMicrocurriculo = function (idMicrocurriculo) {
		MicrocurriculoFactory.delete({ id: idMicrocurriculo});
		$scope.microcurriculos = MicrocurriculosFactory.query();
	};

	/* callback for ng-click 'save': */
	$scope.createNewMicrocurriculo= function () {
		$location.path('/microcurriculo-creation');
	};

	$scope.microcurriculos = MicrocurriculosFactory.query();
}]);

app.controller('MicrocurriculoCreationCtrl', ['$scope', 'MicrocurriculosFactory', '$location',
	function ($scope, microcurriculosFactory, $location) {
	/* callback for ng-click 'save': */
	$scope.createNewMicrocurriculo = function () {
		MicrocurriculosFactory.create($scope.microcurriculos);
	};
	$scope.microcurriculos = MicrocurriculosFactory.query();
}]);

/*
 * ////////////////////PLANEADOR ///////////////////////////
 */
app.controller('PlaneadorListCtrl', ['$scope', 'PlaneadoresFactory', 'PlaneadorFactory', '$location',
	function ($scope, PlaneadoresFactory, PlaneadorFactory, $location) {

	/* callback for ng-click 'remove': */
	$scope.removePlaneador = function (idPlaneador) {
		PlaneadorFactory.delete({ id: idPlaneador });
		$scope.planeadores = PlaneadoresFactory.query();
	};

	/* callback for ng-click 'save': */
	$scope.createNewPlaneador = function () {
		$location.path('/planeador-creation');
	};

	$scope.planeadores = PlaneadorFactory.query();
}]);

app.controller('PlaneadorCreationCtrl', ['$scope', 'PlaneadoresFactory', '$location',
	function ($scope, PlaneadoresFactory, $location) {

	/* callback for ng-click 'save': */
	$scope.createNewPlaneador = function () {
		PlaneadoresFactory.create($scope.planeador);
	};

	$scope.planeadores = PlaneadoresFactory.query();
}]);
/*
 * ////////////////////ROL ///////////////////////////
 */
app.controller('RolListCtrl', ['$scope', 'RolFactory', 'RolFactory', '$location',
	function ($scope, RolsFactory, RolFactory, $location) {

	/* callback for ng-click 'remove': */
	$scope.removeRol = function (idRol) {
		RolFactory.delete({ id: idRol });
		$scope.rol = RolFactory.query();
	};

	/* callback for ng-click 'save': */
	$scope.createNewRol = function () {
		$location.path('/rol-creation');
	};

	$scope.rol = RolFactory.query();
}]);

app.controller('RolCreationCtrl', ['$scope', 'RolFactory', '$location',
	function ($scope, RolFactory, $location) {
	/* callback for ng-click 'save': */
	$scope.createNewRol = function () {
		RolFactory.create($scope.rol);
	};
	$scope.rol = RolFactory.query();
}]);

/*
 * ////////////////////TEMAS DADOS ///////////////////////////
 */
app.controller('TemasDadoListCtrl', ['$scope', 'TemasDadosFactory', 'TemasDadoFactory', '$location',
	function ($scope, TemasDadosFactory, TemasDadoFactory, $location) {

	/* callback for ng-click 'remove': */
	$scope.removeTemasDado = function (idTemasDado) {
		TemasDadoFactory.delete({ id: idTemasDado });
		$scope.temasDados = TemasDadosFactory.query();
	};

	/* callback for ng-click 'save': */
	$scope.createNewTemasDado = function () {
		$location.path('/temasDado-creation');
	};

	$scope.temasDados = TemasDadosFactory.query();
}]);

app.controller('TemasDadoCreationCtrl', ['$scope', 'TemasDadosFactory', '$location',
	function ($scope, TemasDadosFactory, $location) {

	/* callback for ng-click 'save': */
	$scope.createNewTemasDado = function () {
		TemasDadosFactory.create($scope.temasDado);
	};

	$scope.temasDados = temasDadosFactory.query();
}]);
/*
 * ////////////////////TEMAS MICROCURR ///////////////////////////
 */		
app.controller('TemasMicroListCtrl', ['$scope', 'TemasMicrosFactory', 'TemasMicroFactory', '$location',
	function ($scope, TemasMicrosFactory, TemasMicroFactory, $location) {

	/* callback for ng-click 'remove': */
	$scope.removeTemasMicro = function (idTemasMicro) {
		TemasMicroFactory.delete({ id: idTemasMicro });
		$scope.temasMicros = TemasMicrosFactory.query();
	};

	/* callback for ng-click 'save': */
	$scope.createNewTemasMicro = function () {
		$location.path('/temasMicros-creation');
	};

	$scope.temasMicros = TemasMicrosFactory.query();
}]);

app.controller('TemasMicroCreationCtrl', ['$scope', 'TemasMicrosFactory', '$location',
	function ($scope, TemasMicrosFactory, $location) {

	/* callback for ng-click 'save': */
	$scope.createNewTemasMicro = function () {
		TemasMicrosFactory.create($scope.temasMicro);
	};

	$scope.temasMicros = TemasMicrosFactory.query();
}]);	


/*
 * ////////////////////Tipo Bibliografia ///////////////////////////
 */	
app.controller('TipoBibliografiaListCtrl', ['$scope', 'TipoBibliografiasFactory', 'TipoBibliografiaFactory', '$location',
	function ($scope, TipoBibliografiasFactory, TipoBibliografiaFactory, $location) {

	/* callback for ng-click 'remove': */
	$scope.removeTipoBibliografia = function (idTipoBibliografia) {
		TipoBibliografiaFactory.delete({ id: idTipoBibliografia });
		$scope.tipoBibliografia = TipoBibliografiasFactory.query();
	};

	/* callback for ng-click 'save': */
	$scope.createNewTipoBibliografia = function () {
		$location.path('/tipoBibliografia-creation');
	};

	$scope.tipoBibliografias = TipoBibliografiasFactory.query();
}]);

app.controller('TipoBibliografiaCreationCtrl', ['$scope', 'ProgramasFactory', '$location',
	function ($scope, ProgramasFactory, $location) {

	/* callback for ng-click 'save': */
	$scope.createNewTipoBibliografia = function () {
		TipoBibliografiasFactory.create($scope.tipoBibliografia);
	};

	$scope.tipoBibliografias = TipoBibliografiasFactory.query();
}]);

/*
 * ////////////////////UNIDAD MICROCURRICULO ///////////////////////////
 */
app.controller('UnidadMicrocurListCtrl', ['$scope', 'UnidadMicrocursFactory', 'UnidadMicrocurFactory', '$location',
	function ($scope, UnidadMicrocursFactory, UnidadMicrocurFactory, $location) {

	/* callback for ng-click 'remove': */
	$scope.removeUnidadMicrocur = function (idUnidadMicrocur) {
		UnidadMicrocurFactory.delete({ id: idUnidadMicrocur });
		$scope.unidadMicrocurs = UnidadMicrocurFactory.query();
	};

	/* callback for ng-click 'save': */
	$scope.createNewUnidadMicrocur = function () {
		$location.path('/unidadMicrocur-creation');
	};

	$scope.unidadMicrocurs = UnidadMicrocursFactory.query();
}]);

app.controller('UnidadMicrocurCreationCtrl', ['$scope', 'UnidadMicrocursFactory', '$location',
	function ($scope, UnidadMicrocursFactory, $location) {

	/* callback for ng-click 'save': */
	$scope.createNewUnidadMicrocur = function () {
		UnidadMicrocursFactory.create($scope.unidadMicrocur);
	};

	$scope.unidadMicrocurs = UnidadMicrocursFactory.query();
}]);

/*
 * ////////////////////USUARIOS ///////////////////////////
 */
app.controller('UsuarioListCtrl', ['$scope', 'UsuariosFactory', 'UsuarioFactory', '$location',
	function ($scope, UsuariosFactory, UsuarioFactory, $location) {

	/* callback for ng-click 'remove': */
	$scope.removeUsuario = function (idUsuario) {
		UsuarioFactory.delete({ id: idUsuario });
		$scope.usuarios = UsuariosFactory.query();
	};

	/* callback for ng-click 'save': */
	$scope.createNewUsuario = function () {
		$location.path('/usuario-creation');
	};

	$scope.usuario = UsuariosFactory.query();
}]);

app.controller('ProgramaCreationCtrl', ['$scope', 'ProgramasFactory', '$location',
	function ($scope, ProgramasFactory, $location) {

	/* callback for ng-click 'save': */
	$scope.createNewPrograma = function () {
		ProgramasFactory.create($scope.programa);
	};

	$scope.programa = ProgramasFactory.query();
}]);

