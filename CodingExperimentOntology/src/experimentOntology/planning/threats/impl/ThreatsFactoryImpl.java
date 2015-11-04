/**
 */
package experimentOntology.planning.threats.impl;

import experimentOntology.planning.threats.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThreatsFactoryImpl extends EFactoryImpl implements ThreatsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ThreatsFactory init() {
		try {
			ThreatsFactory theThreatsFactory = (ThreatsFactory)EPackage.Registry.INSTANCE.getEFactory(ThreatsPackage.eNS_URI);
			if (theThreatsFactory != null) {
				return theThreatsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ThreatsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreatsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ThreatsPackage.THREATS: return createThreats();
			case ThreatsPackage.DIFFUSION_OF_IMITATION: return createDiffusionOfImitation();
			case ThreatsPackage.MORTALITY: return createMortality();
			case ThreatsPackage.HISTORY: return createHistory();
			case ThreatsPackage.AMBIGUITY: return createAmbiguity();
			case ThreatsPackage.INTERACTION_WITH_SELECTION: return createInteractionWithSelection();
			case ThreatsPackage.SELECTION: return createSelection();
			case ThreatsPackage.INSTRUMENTATION: return createInstrumentation();
			case ThreatsPackage.MATURATION: return createMaturation();
			case ThreatsPackage.RESENTFUL_DEMORALIZATION: return createResentfulDemoralization();
			case ThreatsPackage.STATISTICAL_REGRETION: return createStatisticalRegretion();
			case ThreatsPackage.COMPENSATORY_RIVALITY: return createCompensatoryRivality();
			case ThreatsPackage.INTERACTION_WITH_SETTING: return createInteractionWithSetting();
			case ThreatsPackage.INTERACTION_OF_HISTORY: return createInteractionOfHistory();
			case ThreatsPackage.INTERACTION_OF_SELECTION: return createInteractionOfSelection();
			case ThreatsPackage.RELIALIBILITY_OF_MEASURES: return createRelialibilityOfMeasures();
			case ThreatsPackage.LOW_STATISTICAL_POWER: return createLowStatisticalPower();
			case ThreatsPackage.RELIZABILITY_OF_TREATMENT: return createRelizabilityOfTreatment();
			case ThreatsPackage.RANDOM_IRRELEVANCE: return createRandomIrrelevance();
			case ThreatsPackage.FISHING_AND_ERROR_RATE: return createFishingAndErrorRate();
			case ThreatsPackage.VIOLATED_ASSUMPTION: return createViolatedAssumption();
			case ThreatsPackage.RANDOM_HETERIOGENITY: return createRandomHeteriogenity();
			case ThreatsPackage.INADEQUADE_PREOPERATION: return createInadequadePreoperation();
			case ThreatsPackage.EXPERIMENTER_EXPECTATION: return createExperimenterExpectation();
			case ThreatsPackage.RESTRICTED_GENERALIZATION: return createRestrictedGeneralization();
			case ThreatsPackage.INTERACTION_OF_TESTING: return createInteractionOfTesting();
			case ThreatsPackage.HIPOTHESIS_GUESSING: return createHipothesisGuessing();
			case ThreatsPackage.EVALUATION_APPREENSION: return createEvaluationAppreension();
			case ThreatsPackage.MONO_METHOD_BIAS: return createMonoMethodBias();
			case ThreatsPackage.CONFOUNDING_CONSTRUCT: return createConfoundingConstruct();
			case ThreatsPackage.MONO_OPERATION_BIAS: return createMonoOperationBias();
			case ThreatsPackage.INTERACTION_OF_DIFFERENTS: return createInteractionOfDifferents();
			case ThreatsPackage.MITIGATION_ACTION: return createMitigationAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Threats createThreats() {
		ThreatsImpl threats = new ThreatsImpl();
		return threats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffusionOfImitation createDiffusionOfImitation() {
		DiffusionOfImitationImpl diffusionOfImitation = new DiffusionOfImitationImpl();
		return diffusionOfImitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mortality createMortality() {
		MortalityImpl mortality = new MortalityImpl();
		return mortality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public History createHistory() {
		HistoryImpl history = new HistoryImpl();
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ambiguity createAmbiguity() {
		AmbiguityImpl ambiguity = new AmbiguityImpl();
		return ambiguity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionWithSelection createInteractionWithSelection() {
		InteractionWithSelectionImpl interactionWithSelection = new InteractionWithSelectionImpl();
		return interactionWithSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection createSelection() {
		SelectionImpl selection = new SelectionImpl();
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instrumentation createInstrumentation() {
		InstrumentationImpl instrumentation = new InstrumentationImpl();
		return instrumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Maturation createMaturation() {
		MaturationImpl maturation = new MaturationImpl();
		return maturation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResentfulDemoralization createResentfulDemoralization() {
		ResentfulDemoralizationImpl resentfulDemoralization = new ResentfulDemoralizationImpl();
		return resentfulDemoralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticalRegretion createStatisticalRegretion() {
		StatisticalRegretionImpl statisticalRegretion = new StatisticalRegretionImpl();
		return statisticalRegretion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompensatoryRivality createCompensatoryRivality() {
		CompensatoryRivalityImpl compensatoryRivality = new CompensatoryRivalityImpl();
		return compensatoryRivality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionWithSetting createInteractionWithSetting() {
		InteractionWithSettingImpl interactionWithSetting = new InteractionWithSettingImpl();
		return interactionWithSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOfHistory createInteractionOfHistory() {
		InteractionOfHistoryImpl interactionOfHistory = new InteractionOfHistoryImpl();
		return interactionOfHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOfSelection createInteractionOfSelection() {
		InteractionOfSelectionImpl interactionOfSelection = new InteractionOfSelectionImpl();
		return interactionOfSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelialibilityOfMeasures createRelialibilityOfMeasures() {
		RelialibilityOfMeasuresImpl relialibilityOfMeasures = new RelialibilityOfMeasuresImpl();
		return relialibilityOfMeasures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowStatisticalPower createLowStatisticalPower() {
		LowStatisticalPowerImpl lowStatisticalPower = new LowStatisticalPowerImpl();
		return lowStatisticalPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelizabilityOfTreatment createRelizabilityOfTreatment() {
		RelizabilityOfTreatmentImpl relizabilityOfTreatment = new RelizabilityOfTreatmentImpl();
		return relizabilityOfTreatment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RandomIrrelevance createRandomIrrelevance() {
		RandomIrrelevanceImpl randomIrrelevance = new RandomIrrelevanceImpl();
		return randomIrrelevance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FishingAndErrorRate createFishingAndErrorRate() {
		FishingAndErrorRateImpl fishingAndErrorRate = new FishingAndErrorRateImpl();
		return fishingAndErrorRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViolatedAssumption createViolatedAssumption() {
		ViolatedAssumptionImpl violatedAssumption = new ViolatedAssumptionImpl();
		return violatedAssumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RandomHeteriogenity createRandomHeteriogenity() {
		RandomHeteriogenityImpl randomHeteriogenity = new RandomHeteriogenityImpl();
		return randomHeteriogenity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InadequadePreoperation createInadequadePreoperation() {
		InadequadePreoperationImpl inadequadePreoperation = new InadequadePreoperationImpl();
		return inadequadePreoperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimenterExpectation createExperimenterExpectation() {
		ExperimenterExpectationImpl experimenterExpectation = new ExperimenterExpectationImpl();
		return experimenterExpectation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictedGeneralization createRestrictedGeneralization() {
		RestrictedGeneralizationImpl restrictedGeneralization = new RestrictedGeneralizationImpl();
		return restrictedGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOfTesting createInteractionOfTesting() {
		InteractionOfTestingImpl interactionOfTesting = new InteractionOfTestingImpl();
		return interactionOfTesting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HipothesisGuessing createHipothesisGuessing() {
		HipothesisGuessingImpl hipothesisGuessing = new HipothesisGuessingImpl();
		return hipothesisGuessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationAppreension createEvaluationAppreension() {
		EvaluationAppreensionImpl evaluationAppreension = new EvaluationAppreensionImpl();
		return evaluationAppreension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonoMethodBias createMonoMethodBias() {
		MonoMethodBiasImpl monoMethodBias = new MonoMethodBiasImpl();
		return monoMethodBias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfoundingConstruct createConfoundingConstruct() {
		ConfoundingConstructImpl confoundingConstruct = new ConfoundingConstructImpl();
		return confoundingConstruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonoOperationBias createMonoOperationBias() {
		MonoOperationBiasImpl monoOperationBias = new MonoOperationBiasImpl();
		return monoOperationBias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOfDifferents createInteractionOfDifferents() {
		InteractionOfDifferentsImpl interactionOfDifferents = new InteractionOfDifferentsImpl();
		return interactionOfDifferents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MitigationAction createMitigationAction() {
		MitigationActionImpl mitigationAction = new MitigationActionImpl();
		return mitigationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreatsPackage getThreatsPackage() {
		return (ThreatsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ThreatsPackage getPackage() {
		return ThreatsPackage.eINSTANCE;
	}

} //ThreatsFactoryImpl
