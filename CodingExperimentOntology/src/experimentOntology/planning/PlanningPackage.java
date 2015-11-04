/**
 */
package experimentOntology.planning;

import org.eclipse.emf.ecore.EClass;
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
 * @see experimentOntology.planning.PlanningFactory
 * @model kind="package"
 * @generated
 */
public interface PlanningPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "planning";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/planning";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "planning";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlanningPackage eINSTANCE = experimentOntology.planning.impl.PlanningPackageImpl.init();

	/**
	 * The meta object id for the '{@link experimentOntology.planning.impl.DependentVariableImpl <em>Dependent Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.impl.DependentVariableImpl
	 * @see experimentOntology.planning.impl.PlanningPackageImpl#getDependentVariable()
	 * @generated
	 */
	int DEPENDENT_VARIABLE = 0;

	/**
	 * The number of structural features of the '<em>Dependent Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_VARIABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dependent Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.impl.ExperimentalPlanImpl <em>Experimental Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.impl.ExperimentalPlanImpl
	 * @see experimentOntology.planning.impl.PlanningPackageImpl#getExperimentalPlan()
	 * @generated
	 */
	int EXPERIMENTAL_PLAN = 1;

	/**
	 * The feature id for the '<em><b>Threats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_PLAN__THREATS = 0;

	/**
	 * The feature id for the '<em><b>Samplingstrategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_PLAN__SAMPLINGSTRATEGY = 1;

	/**
	 * The feature id for the '<em><b>Apparatus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_PLAN__APPARATUS = 2;

	/**
	 * The feature id for the '<em><b>Dependent Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_PLAN__DEPENDENT_VARIABLES = 3;

	/**
	 * The feature id for the '<em><b>Independentvariables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_PLAN__INDEPENDENTVARIABLES = 4;

	/**
	 * The number of structural features of the '<em>Experimental Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_PLAN_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Experimental Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.impl.IndependentVariableImpl <em>Independent Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.impl.IndependentVariableImpl
	 * @see experimentOntology.planning.impl.PlanningPackageImpl#getIndependentVariable()
	 * @generated
	 */
	int INDEPENDENT_VARIABLE = 2;

	/**
	 * The number of structural features of the '<em>Independent Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEPENDENT_VARIABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Independent Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEPENDENT_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.impl.ApparatusImpl <em>Apparatus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.impl.ApparatusImpl
	 * @see experimentOntology.planning.impl.PlanningPackageImpl#getApparatus()
	 * @generated
	 */
	int APPARATUS = 3;

	/**
	 * The number of structural features of the '<em>Apparatus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARATUS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Apparatus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPARATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.impl.ArtifactImpl
	 * @see experimentOntology.planning.impl.PlanningPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 4;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = APPARATUS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = APPARATUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.impl.InstrumentImpl <em>Instrument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.impl.InstrumentImpl
	 * @see experimentOntology.planning.impl.PlanningPackageImpl#getInstrument()
	 * @generated
	 */
	int INSTRUMENT = 5;

	/**
	 * The number of structural features of the '<em>Instrument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT_FEATURE_COUNT = APPARATUS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Instrument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT_OPERATION_COUNT = APPARATUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.impl.FactorImpl <em>Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.impl.FactorImpl
	 * @see experimentOntology.planning.impl.PlanningPackageImpl#getFactor()
	 * @generated
	 */
	int FACTOR = 6;

	/**
	 * The number of structural features of the '<em>Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.impl.DualTreatmentFactorImpl <em>Dual Treatment Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.impl.DualTreatmentFactorImpl
	 * @see experimentOntology.planning.impl.PlanningPackageImpl#getDualTreatmentFactor()
	 * @generated
	 */
	int DUAL_TREATMENT_FACTOR = 7;

	/**
	 * The feature id for the '<em><b>Treatments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_TREATMENT_FACTOR__TREATMENTS = FACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dual Treatment Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_TREATMENT_FACTOR_FEATURE_COUNT = FACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dual Treatment Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_TREATMENT_FACTOR_OPERATION_COUNT = FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.impl.MultiTreatmentFactorImpl <em>Multi Treatment Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.impl.MultiTreatmentFactorImpl
	 * @see experimentOntology.planning.impl.PlanningPackageImpl#getMultiTreatmentFactor()
	 * @generated
	 */
	int MULTI_TREATMENT_FACTOR = 8;

	/**
	 * The feature id for the '<em><b>Treatments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TREATMENT_FACTOR__TREATMENTS = FACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Treatment Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TREATMENT_FACTOR_FEATURE_COUNT = FACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multi Treatment Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TREATMENT_FACTOR_OPERATION_COUNT = FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.impl.TreatmentImpl <em>Treatment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.impl.TreatmentImpl
	 * @see experimentOntology.planning.impl.PlanningPackageImpl#getTreatment()
	 * @generated
	 */
	int TREATMENT = 9;

	/**
	 * The number of structural features of the '<em>Treatment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Treatment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.impl.MonoFactorTreatmentPlanImpl <em>Mono Factor Treatment Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.impl.MonoFactorTreatmentPlanImpl
	 * @see experimentOntology.planning.impl.PlanningPackageImpl#getMonoFactorTreatmentPlan()
	 * @generated
	 */
	int MONO_FACTOR_TREATMENT_PLAN = 10;

	/**
	 * The feature id for the '<em><b>Threats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONO_FACTOR_TREATMENT_PLAN__THREATS = EXPERIMENTAL_PLAN__THREATS;

	/**
	 * The feature id for the '<em><b>Samplingstrategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONO_FACTOR_TREATMENT_PLAN__SAMPLINGSTRATEGY = EXPERIMENTAL_PLAN__SAMPLINGSTRATEGY;

	/**
	 * The feature id for the '<em><b>Apparatus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONO_FACTOR_TREATMENT_PLAN__APPARATUS = EXPERIMENTAL_PLAN__APPARATUS;

	/**
	 * The feature id for the '<em><b>Dependent Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONO_FACTOR_TREATMENT_PLAN__DEPENDENT_VARIABLES = EXPERIMENTAL_PLAN__DEPENDENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Independentvariables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONO_FACTOR_TREATMENT_PLAN__INDEPENDENTVARIABLES = EXPERIMENTAL_PLAN__INDEPENDENTVARIABLES;

	/**
	 * The feature id for the '<em><b>Design</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONO_FACTOR_TREATMENT_PLAN__DESIGN = EXPERIMENTAL_PLAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONO_FACTOR_TREATMENT_PLAN__FACTOR = EXPERIMENTAL_PLAN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mono Factor Treatment Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONO_FACTOR_TREATMENT_PLAN_FEATURE_COUNT = EXPERIMENTAL_PLAN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mono Factor Treatment Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONO_FACTOR_TREATMENT_PLAN_OPERATION_COUNT = EXPERIMENTAL_PLAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.impl.DualFactorPlanImpl <em>Dual Factor Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.impl.DualFactorPlanImpl
	 * @see experimentOntology.planning.impl.PlanningPackageImpl#getDualFactorPlan()
	 * @generated
	 */
	int DUAL_FACTOR_PLAN = 11;

	/**
	 * The feature id for the '<em><b>Threats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_FACTOR_PLAN__THREATS = EXPERIMENTAL_PLAN__THREATS;

	/**
	 * The feature id for the '<em><b>Samplingstrategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_FACTOR_PLAN__SAMPLINGSTRATEGY = EXPERIMENTAL_PLAN__SAMPLINGSTRATEGY;

	/**
	 * The feature id for the '<em><b>Apparatus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_FACTOR_PLAN__APPARATUS = EXPERIMENTAL_PLAN__APPARATUS;

	/**
	 * The feature id for the '<em><b>Dependent Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_FACTOR_PLAN__DEPENDENT_VARIABLES = EXPERIMENTAL_PLAN__DEPENDENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Independentvariables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_FACTOR_PLAN__INDEPENDENTVARIABLES = EXPERIMENTAL_PLAN__INDEPENDENTVARIABLES;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_FACTOR_PLAN__FACTOR = EXPERIMENTAL_PLAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Design</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_FACTOR_PLAN__DESIGN = EXPERIMENTAL_PLAN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dual Factor Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_FACTOR_PLAN_FEATURE_COUNT = EXPERIMENTAL_PLAN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dual Factor Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_FACTOR_PLAN_OPERATION_COUNT = EXPERIMENTAL_PLAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.impl.TernaryFactorPlanImpl <em>Ternary Factor Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.impl.TernaryFactorPlanImpl
	 * @see experimentOntology.planning.impl.PlanningPackageImpl#getTernaryFactorPlan()
	 * @generated
	 */
	int TERNARY_FACTOR_PLAN = 12;

	/**
	 * The feature id for the '<em><b>Threats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_FACTOR_PLAN__THREATS = EXPERIMENTAL_PLAN__THREATS;

	/**
	 * The feature id for the '<em><b>Samplingstrategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_FACTOR_PLAN__SAMPLINGSTRATEGY = EXPERIMENTAL_PLAN__SAMPLINGSTRATEGY;

	/**
	 * The feature id for the '<em><b>Apparatus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_FACTOR_PLAN__APPARATUS = EXPERIMENTAL_PLAN__APPARATUS;

	/**
	 * The feature id for the '<em><b>Dependent Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_FACTOR_PLAN__DEPENDENT_VARIABLES = EXPERIMENTAL_PLAN__DEPENDENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Independentvariables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_FACTOR_PLAN__INDEPENDENTVARIABLES = EXPERIMENTAL_PLAN__INDEPENDENTVARIABLES;

	/**
	 * The feature id for the '<em><b>Factors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_FACTOR_PLAN__FACTORS = EXPERIMENTAL_PLAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Design</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_FACTOR_PLAN__DESIGN = EXPERIMENTAL_PLAN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ternary Factor Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_FACTOR_PLAN_FEATURE_COUNT = EXPERIMENTAL_PLAN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ternary Factor Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_FACTOR_PLAN_OPERATION_COUNT = EXPERIMENTAL_PLAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.impl.GenericPlanImpl <em>Generic Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.impl.GenericPlanImpl
	 * @see experimentOntology.planning.impl.PlanningPackageImpl#getGenericPlan()
	 * @generated
	 */
	int GENERIC_PLAN = 13;

	/**
	 * The feature id for the '<em><b>Threats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PLAN__THREATS = EXPERIMENTAL_PLAN__THREATS;

	/**
	 * The feature id for the '<em><b>Samplingstrategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PLAN__SAMPLINGSTRATEGY = EXPERIMENTAL_PLAN__SAMPLINGSTRATEGY;

	/**
	 * The feature id for the '<em><b>Apparatus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PLAN__APPARATUS = EXPERIMENTAL_PLAN__APPARATUS;

	/**
	 * The feature id for the '<em><b>Dependent Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PLAN__DEPENDENT_VARIABLES = EXPERIMENTAL_PLAN__DEPENDENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Independentvariables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PLAN__INDEPENDENTVARIABLES = EXPERIMENTAL_PLAN__INDEPENDENTVARIABLES;

	/**
	 * The feature id for the '<em><b>Factors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PLAN__FACTORS = EXPERIMENTAL_PLAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Design</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PLAN__DESIGN = EXPERIMENTAL_PLAN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generic Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PLAN_FEATURE_COUNT = EXPERIMENTAL_PLAN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Generic Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PLAN_OPERATION_COUNT = EXPERIMENTAL_PLAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.impl.MonoFactorMultTreatmentPlanImpl <em>Mono Factor Mult Treatment Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.impl.MonoFactorMultTreatmentPlanImpl
	 * @see experimentOntology.planning.impl.PlanningPackageImpl#getMonoFactorMultTreatmentPlan()
	 * @generated
	 */
	int MONO_FACTOR_MULT_TREATMENT_PLAN = 14;

	/**
	 * The feature id for the '<em><b>Threats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONO_FACTOR_MULT_TREATMENT_PLAN__THREATS = EXPERIMENTAL_PLAN__THREATS;

	/**
	 * The feature id for the '<em><b>Samplingstrategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONO_FACTOR_MULT_TREATMENT_PLAN__SAMPLINGSTRATEGY = EXPERIMENTAL_PLAN__SAMPLINGSTRATEGY;

	/**
	 * The feature id for the '<em><b>Apparatus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONO_FACTOR_MULT_TREATMENT_PLAN__APPARATUS = EXPERIMENTAL_PLAN__APPARATUS;

	/**
	 * The feature id for the '<em><b>Dependent Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONO_FACTOR_MULT_TREATMENT_PLAN__DEPENDENT_VARIABLES = EXPERIMENTAL_PLAN__DEPENDENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Independentvariables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONO_FACTOR_MULT_TREATMENT_PLAN__INDEPENDENTVARIABLES = EXPERIMENTAL_PLAN__INDEPENDENTVARIABLES;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONO_FACTOR_MULT_TREATMENT_PLAN__FACTOR = EXPERIMENTAL_PLAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Design</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONO_FACTOR_MULT_TREATMENT_PLAN__DESIGN = EXPERIMENTAL_PLAN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mono Factor Mult Treatment Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONO_FACTOR_MULT_TREATMENT_PLAN_FEATURE_COUNT = EXPERIMENTAL_PLAN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mono Factor Mult Treatment Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONO_FACTOR_MULT_TREATMENT_PLAN_OPERATION_COUNT = EXPERIMENTAL_PLAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.impl.ExperimentalPlanDescriptionImpl <em>Experimental Plan Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.impl.ExperimentalPlanDescriptionImpl
	 * @see experimentOntology.planning.impl.PlanningPackageImpl#getExperimentalPlanDescription()
	 * @generated
	 */
	int EXPERIMENTAL_PLAN_DESCRIPTION = 15;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_PLAN_DESCRIPTION__PLAN = 0;

	/**
	 * The number of structural features of the '<em>Experimental Plan Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_PLAN_DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Experimental Plan Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_PLAN_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.impl.PiecesOfApparatusImpl <em>Pieces Of Apparatus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.impl.PiecesOfApparatusImpl
	 * @see experimentOntology.planning.impl.PlanningPackageImpl#getPiecesOfApparatus()
	 * @generated
	 */
	int PIECES_OF_APPARATUS = 16;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECES_OF_APPARATUS__COMPONENTS = 0;

	/**
	 * The number of structural features of the '<em>Pieces Of Apparatus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECES_OF_APPARATUS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Pieces Of Apparatus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECES_OF_APPARATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.impl.IndependentVariablesImpl <em>Independent Variables</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.impl.IndependentVariablesImpl
	 * @see experimentOntology.planning.impl.PlanningPackageImpl#getIndependentVariables()
	 * @generated
	 */
	int INDEPENDENT_VARIABLES = 17;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEPENDENT_VARIABLES__VARIABLES = 0;

	/**
	 * The number of structural features of the '<em>Independent Variables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEPENDENT_VARIABLES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Independent Variables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEPENDENT_VARIABLES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.impl.DependentVariablesImpl <em>Dependent Variables</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.impl.DependentVariablesImpl
	 * @see experimentOntology.planning.impl.PlanningPackageImpl#getDependentVariables()
	 * @generated
	 */
	int DEPENDENT_VARIABLES = 18;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_VARIABLES__VARIABLES = 0;

	/**
	 * The number of structural features of the '<em>Dependent Variables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_VARIABLES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dependent Variables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_VARIABLES_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.DependentVariable <em>Dependent Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependent Variable</em>'.
	 * @see experimentOntology.planning.DependentVariable
	 * @generated
	 */
	EClass getDependentVariable();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.ExperimentalPlan <em>Experimental Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experimental Plan</em>'.
	 * @see experimentOntology.planning.ExperimentalPlan
	 * @generated
	 */
	EClass getExperimentalPlan();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.planning.ExperimentalPlan#getThreats <em>Threats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Threats</em>'.
	 * @see experimentOntology.planning.ExperimentalPlan#getThreats()
	 * @see #getExperimentalPlan()
	 * @generated
	 */
	EReference getExperimentalPlan_Threats();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.planning.ExperimentalPlan#getSamplingstrategy <em>Samplingstrategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Samplingstrategy</em>'.
	 * @see experimentOntology.planning.ExperimentalPlan#getSamplingstrategy()
	 * @see #getExperimentalPlan()
	 * @generated
	 */
	EReference getExperimentalPlan_Samplingstrategy();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.planning.ExperimentalPlan#getApparatus <em>Apparatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Apparatus</em>'.
	 * @see experimentOntology.planning.ExperimentalPlan#getApparatus()
	 * @see #getExperimentalPlan()
	 * @generated
	 */
	EReference getExperimentalPlan_Apparatus();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.planning.ExperimentalPlan#getDependentVariables <em>Dependent Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependent Variables</em>'.
	 * @see experimentOntology.planning.ExperimentalPlan#getDependentVariables()
	 * @see #getExperimentalPlan()
	 * @generated
	 */
	EReference getExperimentalPlan_DependentVariables();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.planning.ExperimentalPlan#getIndependentvariables <em>Independentvariables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Independentvariables</em>'.
	 * @see experimentOntology.planning.ExperimentalPlan#getIndependentvariables()
	 * @see #getExperimentalPlan()
	 * @generated
	 */
	EReference getExperimentalPlan_Independentvariables();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.IndependentVariable <em>Independent Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Independent Variable</em>'.
	 * @see experimentOntology.planning.IndependentVariable
	 * @generated
	 */
	EClass getIndependentVariable();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.Apparatus <em>Apparatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apparatus</em>'.
	 * @see experimentOntology.planning.Apparatus
	 * @generated
	 */
	EClass getApparatus();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see experimentOntology.planning.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.Instrument <em>Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instrument</em>'.
	 * @see experimentOntology.planning.Instrument
	 * @generated
	 */
	EClass getInstrument();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.Factor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factor</em>'.
	 * @see experimentOntology.planning.Factor
	 * @generated
	 */
	EClass getFactor();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.DualTreatmentFactor <em>Dual Treatment Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dual Treatment Factor</em>'.
	 * @see experimentOntology.planning.DualTreatmentFactor
	 * @generated
	 */
	EClass getDualTreatmentFactor();

	/**
	 * Returns the meta object for the containment reference list '{@link experimentOntology.planning.DualTreatmentFactor#getTreatments <em>Treatments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Treatments</em>'.
	 * @see experimentOntology.planning.DualTreatmentFactor#getTreatments()
	 * @see #getDualTreatmentFactor()
	 * @generated
	 */
	EReference getDualTreatmentFactor_Treatments();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.MultiTreatmentFactor <em>Multi Treatment Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Treatment Factor</em>'.
	 * @see experimentOntology.planning.MultiTreatmentFactor
	 * @generated
	 */
	EClass getMultiTreatmentFactor();

	/**
	 * Returns the meta object for the containment reference list '{@link experimentOntology.planning.MultiTreatmentFactor#getTreatments <em>Treatments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Treatments</em>'.
	 * @see experimentOntology.planning.MultiTreatmentFactor#getTreatments()
	 * @see #getMultiTreatmentFactor()
	 * @generated
	 */
	EReference getMultiTreatmentFactor_Treatments();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.Treatment <em>Treatment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Treatment</em>'.
	 * @see experimentOntology.planning.Treatment
	 * @generated
	 */
	EClass getTreatment();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.MonoFactorTreatmentPlan <em>Mono Factor Treatment Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mono Factor Treatment Plan</em>'.
	 * @see experimentOntology.planning.MonoFactorTreatmentPlan
	 * @generated
	 */
	EClass getMonoFactorTreatmentPlan();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.planning.MonoFactorTreatmentPlan#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Design</em>'.
	 * @see experimentOntology.planning.MonoFactorTreatmentPlan#getDesign()
	 * @see #getMonoFactorTreatmentPlan()
	 * @generated
	 */
	EReference getMonoFactorTreatmentPlan_Design();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.planning.MonoFactorTreatmentPlan#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Factor</em>'.
	 * @see experimentOntology.planning.MonoFactorTreatmentPlan#getFactor()
	 * @see #getMonoFactorTreatmentPlan()
	 * @generated
	 */
	EReference getMonoFactorTreatmentPlan_Factor();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.DualFactorPlan <em>Dual Factor Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dual Factor Plan</em>'.
	 * @see experimentOntology.planning.DualFactorPlan
	 * @generated
	 */
	EClass getDualFactorPlan();

	/**
	 * Returns the meta object for the containment reference list '{@link experimentOntology.planning.DualFactorPlan#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Factor</em>'.
	 * @see experimentOntology.planning.DualFactorPlan#getFactor()
	 * @see #getDualFactorPlan()
	 * @generated
	 */
	EReference getDualFactorPlan_Factor();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.planning.DualFactorPlan#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Design</em>'.
	 * @see experimentOntology.planning.DualFactorPlan#getDesign()
	 * @see #getDualFactorPlan()
	 * @generated
	 */
	EReference getDualFactorPlan_Design();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.TernaryFactorPlan <em>Ternary Factor Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ternary Factor Plan</em>'.
	 * @see experimentOntology.planning.TernaryFactorPlan
	 * @generated
	 */
	EClass getTernaryFactorPlan();

	/**
	 * Returns the meta object for the containment reference list '{@link experimentOntology.planning.TernaryFactorPlan#getFactors <em>Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Factors</em>'.
	 * @see experimentOntology.planning.TernaryFactorPlan#getFactors()
	 * @see #getTernaryFactorPlan()
	 * @generated
	 */
	EReference getTernaryFactorPlan_Factors();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.planning.TernaryFactorPlan#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Design</em>'.
	 * @see experimentOntology.planning.TernaryFactorPlan#getDesign()
	 * @see #getTernaryFactorPlan()
	 * @generated
	 */
	EReference getTernaryFactorPlan_Design();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.GenericPlan <em>Generic Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Plan</em>'.
	 * @see experimentOntology.planning.GenericPlan
	 * @generated
	 */
	EClass getGenericPlan();

	/**
	 * Returns the meta object for the containment reference list '{@link experimentOntology.planning.GenericPlan#getFactors <em>Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Factors</em>'.
	 * @see experimentOntology.planning.GenericPlan#getFactors()
	 * @see #getGenericPlan()
	 * @generated
	 */
	EReference getGenericPlan_Factors();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.planning.GenericPlan#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Design</em>'.
	 * @see experimentOntology.planning.GenericPlan#getDesign()
	 * @see #getGenericPlan()
	 * @generated
	 */
	EReference getGenericPlan_Design();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.MonoFactorMultTreatmentPlan <em>Mono Factor Mult Treatment Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mono Factor Mult Treatment Plan</em>'.
	 * @see experimentOntology.planning.MonoFactorMultTreatmentPlan
	 * @generated
	 */
	EClass getMonoFactorMultTreatmentPlan();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.planning.MonoFactorMultTreatmentPlan#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Factor</em>'.
	 * @see experimentOntology.planning.MonoFactorMultTreatmentPlan#getFactor()
	 * @see #getMonoFactorMultTreatmentPlan()
	 * @generated
	 */
	EReference getMonoFactorMultTreatmentPlan_Factor();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.planning.MonoFactorMultTreatmentPlan#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Design</em>'.
	 * @see experimentOntology.planning.MonoFactorMultTreatmentPlan#getDesign()
	 * @see #getMonoFactorMultTreatmentPlan()
	 * @generated
	 */
	EReference getMonoFactorMultTreatmentPlan_Design();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.ExperimentalPlanDescription <em>Experimental Plan Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experimental Plan Description</em>'.
	 * @see experimentOntology.planning.ExperimentalPlanDescription
	 * @generated
	 */
	EClass getExperimentalPlanDescription();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.planning.ExperimentalPlanDescription#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan</em>'.
	 * @see experimentOntology.planning.ExperimentalPlanDescription#getPlan()
	 * @see #getExperimentalPlanDescription()
	 * @generated
	 */
	EReference getExperimentalPlanDescription_Plan();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.PiecesOfApparatus <em>Pieces Of Apparatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pieces Of Apparatus</em>'.
	 * @see experimentOntology.planning.PiecesOfApparatus
	 * @generated
	 */
	EClass getPiecesOfApparatus();

	/**
	 * Returns the meta object for the containment reference list '{@link experimentOntology.planning.PiecesOfApparatus#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see experimentOntology.planning.PiecesOfApparatus#getComponents()
	 * @see #getPiecesOfApparatus()
	 * @generated
	 */
	EReference getPiecesOfApparatus_Components();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.IndependentVariables <em>Independent Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Independent Variables</em>'.
	 * @see experimentOntology.planning.IndependentVariables
	 * @generated
	 */
	EClass getIndependentVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link experimentOntology.planning.IndependentVariables#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see experimentOntology.planning.IndependentVariables#getVariables()
	 * @see #getIndependentVariables()
	 * @generated
	 */
	EReference getIndependentVariables_Variables();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.DependentVariables <em>Dependent Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependent Variables</em>'.
	 * @see experimentOntology.planning.DependentVariables
	 * @generated
	 */
	EClass getDependentVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link experimentOntology.planning.DependentVariables#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see experimentOntology.planning.DependentVariables#getVariables()
	 * @see #getDependentVariables()
	 * @generated
	 */
	EReference getDependentVariables_Variables();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlanningFactory getPlanningFactory();

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
		 * The meta object literal for the '{@link experimentOntology.planning.impl.DependentVariableImpl <em>Dependent Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.impl.DependentVariableImpl
		 * @see experimentOntology.planning.impl.PlanningPackageImpl#getDependentVariable()
		 * @generated
		 */
		EClass DEPENDENT_VARIABLE = eINSTANCE.getDependentVariable();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.impl.ExperimentalPlanImpl <em>Experimental Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.impl.ExperimentalPlanImpl
		 * @see experimentOntology.planning.impl.PlanningPackageImpl#getExperimentalPlan()
		 * @generated
		 */
		EClass EXPERIMENTAL_PLAN = eINSTANCE.getExperimentalPlan();

		/**
		 * The meta object literal for the '<em><b>Threats</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENTAL_PLAN__THREATS = eINSTANCE.getExperimentalPlan_Threats();

		/**
		 * The meta object literal for the '<em><b>Samplingstrategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENTAL_PLAN__SAMPLINGSTRATEGY = eINSTANCE.getExperimentalPlan_Samplingstrategy();

		/**
		 * The meta object literal for the '<em><b>Apparatus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENTAL_PLAN__APPARATUS = eINSTANCE.getExperimentalPlan_Apparatus();

		/**
		 * The meta object literal for the '<em><b>Dependent Variables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENTAL_PLAN__DEPENDENT_VARIABLES = eINSTANCE.getExperimentalPlan_DependentVariables();

		/**
		 * The meta object literal for the '<em><b>Independentvariables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENTAL_PLAN__INDEPENDENTVARIABLES = eINSTANCE.getExperimentalPlan_Independentvariables();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.impl.IndependentVariableImpl <em>Independent Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.impl.IndependentVariableImpl
		 * @see experimentOntology.planning.impl.PlanningPackageImpl#getIndependentVariable()
		 * @generated
		 */
		EClass INDEPENDENT_VARIABLE = eINSTANCE.getIndependentVariable();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.impl.ApparatusImpl <em>Apparatus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.impl.ApparatusImpl
		 * @see experimentOntology.planning.impl.PlanningPackageImpl#getApparatus()
		 * @generated
		 */
		EClass APPARATUS = eINSTANCE.getApparatus();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.impl.ArtifactImpl
		 * @see experimentOntology.planning.impl.PlanningPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.impl.InstrumentImpl <em>Instrument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.impl.InstrumentImpl
		 * @see experimentOntology.planning.impl.PlanningPackageImpl#getInstrument()
		 * @generated
		 */
		EClass INSTRUMENT = eINSTANCE.getInstrument();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.impl.FactorImpl <em>Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.impl.FactorImpl
		 * @see experimentOntology.planning.impl.PlanningPackageImpl#getFactor()
		 * @generated
		 */
		EClass FACTOR = eINSTANCE.getFactor();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.impl.DualTreatmentFactorImpl <em>Dual Treatment Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.impl.DualTreatmentFactorImpl
		 * @see experimentOntology.planning.impl.PlanningPackageImpl#getDualTreatmentFactor()
		 * @generated
		 */
		EClass DUAL_TREATMENT_FACTOR = eINSTANCE.getDualTreatmentFactor();

		/**
		 * The meta object literal for the '<em><b>Treatments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUAL_TREATMENT_FACTOR__TREATMENTS = eINSTANCE.getDualTreatmentFactor_Treatments();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.impl.MultiTreatmentFactorImpl <em>Multi Treatment Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.impl.MultiTreatmentFactorImpl
		 * @see experimentOntology.planning.impl.PlanningPackageImpl#getMultiTreatmentFactor()
		 * @generated
		 */
		EClass MULTI_TREATMENT_FACTOR = eINSTANCE.getMultiTreatmentFactor();

		/**
		 * The meta object literal for the '<em><b>Treatments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_TREATMENT_FACTOR__TREATMENTS = eINSTANCE.getMultiTreatmentFactor_Treatments();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.impl.TreatmentImpl <em>Treatment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.impl.TreatmentImpl
		 * @see experimentOntology.planning.impl.PlanningPackageImpl#getTreatment()
		 * @generated
		 */
		EClass TREATMENT = eINSTANCE.getTreatment();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.impl.MonoFactorTreatmentPlanImpl <em>Mono Factor Treatment Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.impl.MonoFactorTreatmentPlanImpl
		 * @see experimentOntology.planning.impl.PlanningPackageImpl#getMonoFactorTreatmentPlan()
		 * @generated
		 */
		EClass MONO_FACTOR_TREATMENT_PLAN = eINSTANCE.getMonoFactorTreatmentPlan();

		/**
		 * The meta object literal for the '<em><b>Design</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONO_FACTOR_TREATMENT_PLAN__DESIGN = eINSTANCE.getMonoFactorTreatmentPlan_Design();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONO_FACTOR_TREATMENT_PLAN__FACTOR = eINSTANCE.getMonoFactorTreatmentPlan_Factor();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.impl.DualFactorPlanImpl <em>Dual Factor Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.impl.DualFactorPlanImpl
		 * @see experimentOntology.planning.impl.PlanningPackageImpl#getDualFactorPlan()
		 * @generated
		 */
		EClass DUAL_FACTOR_PLAN = eINSTANCE.getDualFactorPlan();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUAL_FACTOR_PLAN__FACTOR = eINSTANCE.getDualFactorPlan_Factor();

		/**
		 * The meta object literal for the '<em><b>Design</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUAL_FACTOR_PLAN__DESIGN = eINSTANCE.getDualFactorPlan_Design();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.impl.TernaryFactorPlanImpl <em>Ternary Factor Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.impl.TernaryFactorPlanImpl
		 * @see experimentOntology.planning.impl.PlanningPackageImpl#getTernaryFactorPlan()
		 * @generated
		 */
		EClass TERNARY_FACTOR_PLAN = eINSTANCE.getTernaryFactorPlan();

		/**
		 * The meta object literal for the '<em><b>Factors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERNARY_FACTOR_PLAN__FACTORS = eINSTANCE.getTernaryFactorPlan_Factors();

		/**
		 * The meta object literal for the '<em><b>Design</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERNARY_FACTOR_PLAN__DESIGN = eINSTANCE.getTernaryFactorPlan_Design();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.impl.GenericPlanImpl <em>Generic Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.impl.GenericPlanImpl
		 * @see experimentOntology.planning.impl.PlanningPackageImpl#getGenericPlan()
		 * @generated
		 */
		EClass GENERIC_PLAN = eINSTANCE.getGenericPlan();

		/**
		 * The meta object literal for the '<em><b>Factors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_PLAN__FACTORS = eINSTANCE.getGenericPlan_Factors();

		/**
		 * The meta object literal for the '<em><b>Design</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_PLAN__DESIGN = eINSTANCE.getGenericPlan_Design();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.impl.MonoFactorMultTreatmentPlanImpl <em>Mono Factor Mult Treatment Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.impl.MonoFactorMultTreatmentPlanImpl
		 * @see experimentOntology.planning.impl.PlanningPackageImpl#getMonoFactorMultTreatmentPlan()
		 * @generated
		 */
		EClass MONO_FACTOR_MULT_TREATMENT_PLAN = eINSTANCE.getMonoFactorMultTreatmentPlan();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONO_FACTOR_MULT_TREATMENT_PLAN__FACTOR = eINSTANCE.getMonoFactorMultTreatmentPlan_Factor();

		/**
		 * The meta object literal for the '<em><b>Design</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONO_FACTOR_MULT_TREATMENT_PLAN__DESIGN = eINSTANCE.getMonoFactorMultTreatmentPlan_Design();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.impl.ExperimentalPlanDescriptionImpl <em>Experimental Plan Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.impl.ExperimentalPlanDescriptionImpl
		 * @see experimentOntology.planning.impl.PlanningPackageImpl#getExperimentalPlanDescription()
		 * @generated
		 */
		EClass EXPERIMENTAL_PLAN_DESCRIPTION = eINSTANCE.getExperimentalPlanDescription();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENTAL_PLAN_DESCRIPTION__PLAN = eINSTANCE.getExperimentalPlanDescription_Plan();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.impl.PiecesOfApparatusImpl <em>Pieces Of Apparatus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.impl.PiecesOfApparatusImpl
		 * @see experimentOntology.planning.impl.PlanningPackageImpl#getPiecesOfApparatus()
		 * @generated
		 */
		EClass PIECES_OF_APPARATUS = eINSTANCE.getPiecesOfApparatus();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIECES_OF_APPARATUS__COMPONENTS = eINSTANCE.getPiecesOfApparatus_Components();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.impl.IndependentVariablesImpl <em>Independent Variables</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.impl.IndependentVariablesImpl
		 * @see experimentOntology.planning.impl.PlanningPackageImpl#getIndependentVariables()
		 * @generated
		 */
		EClass INDEPENDENT_VARIABLES = eINSTANCE.getIndependentVariables();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEPENDENT_VARIABLES__VARIABLES = eINSTANCE.getIndependentVariables_Variables();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.impl.DependentVariablesImpl <em>Dependent Variables</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.impl.DependentVariablesImpl
		 * @see experimentOntology.planning.impl.PlanningPackageImpl#getDependentVariables()
		 * @generated
		 */
		EClass DEPENDENT_VARIABLES = eINSTANCE.getDependentVariables();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENT_VARIABLES__VARIABLES = eINSTANCE.getDependentVariables_Variables();

	}

} //PlanningPackage
