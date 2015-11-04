/**
 */
package codingExperimentOntology.variables;

import experimentOntology.planning.PlanningPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see codingExperimentOntology.variables.NewPackage1Factory
 * @model kind="package"
 * @generated
 */
public interface NewPackage1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "variables";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "variables";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "variables";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NewPackage1Package eINSTANCE = codingExperimentOntology.variables.impl.NewPackage1PackageImpl.init();

	/**
	 * The meta object id for the '{@link codingExperimentOntology.variables.impl.CodingDependentVariableImpl <em>Coding Dependent Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.variables.impl.CodingDependentVariableImpl
	 * @see codingExperimentOntology.variables.impl.NewPackage1PackageImpl#getCodingDependentVariable()
	 * @generated
	 */
	int CODING_DEPENDENT_VARIABLE = 0;

	/**
	 * The number of structural features of the '<em>Coding Dependent Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_DEPENDENT_VARIABLE_FEATURE_COUNT = PlanningPackage.DEPENDENT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Coding Dependent Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_DEPENDENT_VARIABLE_OPERATION_COUNT = PlanningPackage.DEPENDENT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.variables.impl.CodingIndependentVariableImpl <em>Coding Independent Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.variables.impl.CodingIndependentVariableImpl
	 * @see codingExperimentOntology.variables.impl.NewPackage1PackageImpl#getCodingIndependentVariable()
	 * @generated
	 */
	int CODING_INDEPENDENT_VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Coding Independent Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_INDEPENDENT_VARIABLE_FEATURE_COUNT = PlanningPackage.INDEPENDENT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Coding Independent Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_INDEPENDENT_VARIABLE_OPERATION_COUNT = PlanningPackage.INDEPENDENT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.variables.impl.TimeBoundVariableImpl <em>Time Bound Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.variables.impl.TimeBoundVariableImpl
	 * @see codingExperimentOntology.variables.impl.NewPackage1PackageImpl#getTimeBoundVariable()
	 * @generated
	 */
	int TIME_BOUND_VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Time Monitor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BOUND_VARIABLE__TIME_MONITOR = CODING_DEPENDENT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Bound Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BOUND_VARIABLE_FEATURE_COUNT = CODING_DEPENDENT_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time Bound Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BOUND_VARIABLE_OPERATION_COUNT = CODING_DEPENDENT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.variables.impl.ResourceBasedVariableImpl <em>Resource Based Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.variables.impl.ResourceBasedVariableImpl
	 * @see codingExperimentOntology.variables.impl.NewPackage1PackageImpl#getResourceBasedVariable()
	 * @generated
	 */
	int RESOURCE_BASED_VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Time Monitor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BASED_VARIABLE__TIME_MONITOR = TIME_BOUND_VARIABLE__TIME_MONITOR;

	/**
	 * The feature id for the '<em><b>Resource Monitor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BASED_VARIABLE__RESOURCE_MONITOR = TIME_BOUND_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Based Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BASED_VARIABLE_FEATURE_COUNT = TIME_BOUND_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource Based Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BASED_VARIABLE_OPERATION_COUNT = TIME_BOUND_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.variables.impl.AwnserBasedVariableImpl <em>Awnser Based Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.variables.impl.AwnserBasedVariableImpl
	 * @see codingExperimentOntology.variables.impl.NewPackage1PackageImpl#getAwnserBasedVariable()
	 * @generated
	 */
	int AWNSER_BASED_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Time Monitor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWNSER_BASED_VARIABLE__TIME_MONITOR = TIME_BOUND_VARIABLE__TIME_MONITOR;

	/**
	 * The feature id for the '<em><b>Questionnaire</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWNSER_BASED_VARIABLE__QUESTIONNAIRE = TIME_BOUND_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Awnser Based Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWNSER_BASED_VARIABLE_FEATURE_COUNT = TIME_BOUND_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Awnser Based Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWNSER_BASED_VARIABLE_OPERATION_COUNT = TIME_BOUND_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.variables.impl.ArtifactIndependentVariableImpl <em>Artifact Independent Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.variables.impl.ArtifactIndependentVariableImpl
	 * @see codingExperimentOntology.variables.impl.NewPackage1PackageImpl#getArtifactIndependentVariable()
	 * @generated
	 */
	int ARTIFACT_INDEPENDENT_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Codingartifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_INDEPENDENT_VARIABLE__CODINGARTIFACT = CODING_INDEPENDENT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Artifact Independent Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_INDEPENDENT_VARIABLE_FEATURE_COUNT = CODING_INDEPENDENT_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Artifact Independent Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_INDEPENDENT_VARIABLE_OPERATION_COUNT = CODING_INDEPENDENT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.variables.impl.EnviromentIndependentVariableImpl <em>Enviroment Independent Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.variables.impl.EnviromentIndependentVariableImpl
	 * @see codingExperimentOntology.variables.impl.NewPackage1PackageImpl#getEnviromentIndependentVariable()
	 * @generated
	 */
	int ENVIROMENT_INDEPENDENT_VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIROMENT_INDEPENDENT_VARIABLE__TYPE = CODING_INDEPENDENT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enviroment Independent Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIROMENT_INDEPENDENT_VARIABLE_FEATURE_COUNT = CODING_INDEPENDENT_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enviroment Independent Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIROMENT_INDEPENDENT_VARIABLE_OPERATION_COUNT = CODING_INDEPENDENT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.variables.impl.OtherCodingVariableImpl <em>Other Coding Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.variables.impl.OtherCodingVariableImpl
	 * @see codingExperimentOntology.variables.impl.NewPackage1PackageImpl#getOtherCodingVariable()
	 * @generated
	 */
	int OTHER_CODING_VARIABLE = 7;

	/**
	 * The number of structural features of the '<em>Other Coding Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_CODING_VARIABLE_FEATURE_COUNT = CODING_INDEPENDENT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Other Coding Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_CODING_VARIABLE_OPERATION_COUNT = CODING_INDEPENDENT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.variables.CommonVariableTypes <em>Common Variable Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.variables.CommonVariableTypes
	 * @see codingExperimentOntology.variables.impl.NewPackage1PackageImpl#getCommonVariableTypes()
	 * @generated
	 */
	int COMMON_VARIABLE_TYPES = 8;


	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.variables.CodingDependentVariable <em>Coding Dependent Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coding Dependent Variable</em>'.
	 * @see codingExperimentOntology.variables.CodingDependentVariable
	 * @generated
	 */
	EClass getCodingDependentVariable();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.variables.CodingIndependentVariable <em>Coding Independent Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coding Independent Variable</em>'.
	 * @see codingExperimentOntology.variables.CodingIndependentVariable
	 * @generated
	 */
	EClass getCodingIndependentVariable();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.variables.TimeBoundVariable <em>Time Bound Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Bound Variable</em>'.
	 * @see codingExperimentOntology.variables.TimeBoundVariable
	 * @generated
	 */
	EClass getTimeBoundVariable();

	/**
	 * Returns the meta object for the reference list '{@link codingExperimentOntology.variables.TimeBoundVariable#getTimeMonitor <em>Time Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Monitor</em>'.
	 * @see codingExperimentOntology.variables.TimeBoundVariable#getTimeMonitor()
	 * @see #getTimeBoundVariable()
	 * @generated
	 */
	EReference getTimeBoundVariable_TimeMonitor();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.variables.ResourceBasedVariable <em>Resource Based Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Based Variable</em>'.
	 * @see codingExperimentOntology.variables.ResourceBasedVariable
	 * @generated
	 */
	EClass getResourceBasedVariable();

	/**
	 * Returns the meta object for the reference list '{@link codingExperimentOntology.variables.ResourceBasedVariable#getResourceMonitor <em>Resource Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource Monitor</em>'.
	 * @see codingExperimentOntology.variables.ResourceBasedVariable#getResourceMonitor()
	 * @see #getResourceBasedVariable()
	 * @generated
	 */
	EReference getResourceBasedVariable_ResourceMonitor();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.variables.AwnserBasedVariable <em>Awnser Based Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Awnser Based Variable</em>'.
	 * @see codingExperimentOntology.variables.AwnserBasedVariable
	 * @generated
	 */
	EClass getAwnserBasedVariable();

	/**
	 * Returns the meta object for the reference list '{@link codingExperimentOntology.variables.AwnserBasedVariable#getQuestionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Questionnaire</em>'.
	 * @see codingExperimentOntology.variables.AwnserBasedVariable#getQuestionnaire()
	 * @see #getAwnserBasedVariable()
	 * @generated
	 */
	EReference getAwnserBasedVariable_Questionnaire();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.variables.ArtifactIndependentVariable <em>Artifact Independent Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Independent Variable</em>'.
	 * @see codingExperimentOntology.variables.ArtifactIndependentVariable
	 * @generated
	 */
	EClass getArtifactIndependentVariable();

	/**
	 * Returns the meta object for the reference list '{@link codingExperimentOntology.variables.ArtifactIndependentVariable#getCodingartifact <em>Codingartifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Codingartifact</em>'.
	 * @see codingExperimentOntology.variables.ArtifactIndependentVariable#getCodingartifact()
	 * @see #getArtifactIndependentVariable()
	 * @generated
	 */
	EReference getArtifactIndependentVariable_Codingartifact();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.variables.EnviromentIndependentVariable <em>Enviroment Independent Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enviroment Independent Variable</em>'.
	 * @see codingExperimentOntology.variables.EnviromentIndependentVariable
	 * @generated
	 */
	EClass getEnviromentIndependentVariable();

	/**
	 * Returns the meta object for the attribute '{@link codingExperimentOntology.variables.EnviromentIndependentVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see codingExperimentOntology.variables.EnviromentIndependentVariable#getType()
	 * @see #getEnviromentIndependentVariable()
	 * @generated
	 */
	EAttribute getEnviromentIndependentVariable_Type();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.variables.OtherCodingVariable <em>Other Coding Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Coding Variable</em>'.
	 * @see codingExperimentOntology.variables.OtherCodingVariable
	 * @generated
	 */
	EClass getOtherCodingVariable();

	/**
	 * Returns the meta object for enum '{@link codingExperimentOntology.variables.CommonVariableTypes <em>Common Variable Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Common Variable Types</em>'.
	 * @see codingExperimentOntology.variables.CommonVariableTypes
	 * @generated
	 */
	EEnum getCommonVariableTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NewPackage1Factory getNewPackage1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link codingExperimentOntology.variables.impl.CodingDependentVariableImpl <em>Coding Dependent Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.variables.impl.CodingDependentVariableImpl
		 * @see codingExperimentOntology.variables.impl.NewPackage1PackageImpl#getCodingDependentVariable()
		 * @generated
		 */
		EClass CODING_DEPENDENT_VARIABLE = eINSTANCE.getCodingDependentVariable();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.variables.impl.CodingIndependentVariableImpl <em>Coding Independent Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.variables.impl.CodingIndependentVariableImpl
		 * @see codingExperimentOntology.variables.impl.NewPackage1PackageImpl#getCodingIndependentVariable()
		 * @generated
		 */
		EClass CODING_INDEPENDENT_VARIABLE = eINSTANCE.getCodingIndependentVariable();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.variables.impl.TimeBoundVariableImpl <em>Time Bound Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.variables.impl.TimeBoundVariableImpl
		 * @see codingExperimentOntology.variables.impl.NewPackage1PackageImpl#getTimeBoundVariable()
		 * @generated
		 */
		EClass TIME_BOUND_VARIABLE = eINSTANCE.getTimeBoundVariable();

		/**
		 * The meta object literal for the '<em><b>Time Monitor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_BOUND_VARIABLE__TIME_MONITOR = eINSTANCE.getTimeBoundVariable_TimeMonitor();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.variables.impl.ResourceBasedVariableImpl <em>Resource Based Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.variables.impl.ResourceBasedVariableImpl
		 * @see codingExperimentOntology.variables.impl.NewPackage1PackageImpl#getResourceBasedVariable()
		 * @generated
		 */
		EClass RESOURCE_BASED_VARIABLE = eINSTANCE.getResourceBasedVariable();

		/**
		 * The meta object literal for the '<em><b>Resource Monitor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_BASED_VARIABLE__RESOURCE_MONITOR = eINSTANCE.getResourceBasedVariable_ResourceMonitor();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.variables.impl.AwnserBasedVariableImpl <em>Awnser Based Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.variables.impl.AwnserBasedVariableImpl
		 * @see codingExperimentOntology.variables.impl.NewPackage1PackageImpl#getAwnserBasedVariable()
		 * @generated
		 */
		EClass AWNSER_BASED_VARIABLE = eINSTANCE.getAwnserBasedVariable();

		/**
		 * The meta object literal for the '<em><b>Questionnaire</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWNSER_BASED_VARIABLE__QUESTIONNAIRE = eINSTANCE.getAwnserBasedVariable_Questionnaire();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.variables.impl.ArtifactIndependentVariableImpl <em>Artifact Independent Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.variables.impl.ArtifactIndependentVariableImpl
		 * @see codingExperimentOntology.variables.impl.NewPackage1PackageImpl#getArtifactIndependentVariable()
		 * @generated
		 */
		EClass ARTIFACT_INDEPENDENT_VARIABLE = eINSTANCE.getArtifactIndependentVariable();

		/**
		 * The meta object literal for the '<em><b>Codingartifact</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_INDEPENDENT_VARIABLE__CODINGARTIFACT = eINSTANCE.getArtifactIndependentVariable_Codingartifact();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.variables.impl.EnviromentIndependentVariableImpl <em>Enviroment Independent Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.variables.impl.EnviromentIndependentVariableImpl
		 * @see codingExperimentOntology.variables.impl.NewPackage1PackageImpl#getEnviromentIndependentVariable()
		 * @generated
		 */
		EClass ENVIROMENT_INDEPENDENT_VARIABLE = eINSTANCE.getEnviromentIndependentVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIROMENT_INDEPENDENT_VARIABLE__TYPE = eINSTANCE.getEnviromentIndependentVariable_Type();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.variables.impl.OtherCodingVariableImpl <em>Other Coding Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.variables.impl.OtherCodingVariableImpl
		 * @see codingExperimentOntology.variables.impl.NewPackage1PackageImpl#getOtherCodingVariable()
		 * @generated
		 */
		EClass OTHER_CODING_VARIABLE = eINSTANCE.getOtherCodingVariable();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.variables.CommonVariableTypes <em>Common Variable Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.variables.CommonVariableTypes
		 * @see codingExperimentOntology.variables.impl.NewPackage1PackageImpl#getCommonVariableTypes()
		 * @generated
		 */
		EEnum COMMON_VARIABLE_TYPES = eINSTANCE.getCommonVariableTypes();

	}

} //NewPackage1Package
