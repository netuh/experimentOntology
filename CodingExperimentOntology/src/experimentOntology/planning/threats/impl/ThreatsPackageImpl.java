/**
 */
package experimentOntology.planning.threats.impl;

import codingExperimentOntology.CodingExperimentOntologyPackage;

import codingExperimentOntology.apparatus.NewPackage4Package;

import codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl;

import codingExperimentOntology.impl.CodingExperimentOntologyPackageImpl;

import codingExperimentOntology.tasks.NewPackage2Package;

import codingExperimentOntology.tasks.impl.NewPackage2PackageImpl;

import codingExperimentOntology.threats.NewPackage3Package;

import codingExperimentOntology.threats.impl.NewPackage3PackageImpl;

import codingExperimentOntology.variables.NewPackage1Package;

import codingExperimentOntology.variables.impl.NewPackage1PackageImpl;

import experimentOntology.ExperimentOntologyPackage;

import experimentOntology.description.DescriptionPackage;

import experimentOntology.description.gqm.GqmPackage;

import experimentOntology.description.gqm.impl.GqmPackageImpl;

import experimentOntology.description.impl.DescriptionPackageImpl;

import experimentOntology.impl.ExperimentOntologyPackageImpl;

import experimentOntology.operation.OperationPackage;

import experimentOntology.operation.impl.OperationPackageImpl;

import experimentOntology.operation.taskCompositionFramework.TaskCompositionFrameworkPackage;

import experimentOntology.operation.taskCompositionFramework.impl.TaskCompositionFrameworkPackageImpl;

import experimentOntology.planning.PlanningPackage;

import experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage;

import experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl;

import experimentOntology.planning.impl.PlanningPackageImpl;

import experimentOntology.planning.sampling.SamplingPackage;

import experimentOntology.planning.sampling.impl.SamplingPackageImpl;

import experimentOntology.planning.threats.Ambiguity;
import experimentOntology.planning.threats.CompensatoryRivality;
import experimentOntology.planning.threats.ConclusionThreat;
import experimentOntology.planning.threats.ConfoundingConstruct;
import experimentOntology.planning.threats.ConstructTreat;
import experimentOntology.planning.threats.DiffusionOfImitation;
import experimentOntology.planning.threats.EvaluationAppreension;
import experimentOntology.planning.threats.ExperimenterExpectation;
import experimentOntology.planning.threats.ExternalThreat;
import experimentOntology.planning.threats.FishingAndErrorRate;
import experimentOntology.planning.threats.HipothesisGuessing;
import experimentOntology.planning.threats.History;
import experimentOntology.planning.threats.InadequadePreoperation;
import experimentOntology.planning.threats.Instrumentation;
import experimentOntology.planning.threats.InteractionOfDifferents;
import experimentOntology.planning.threats.InteractionOfHistory;
import experimentOntology.planning.threats.InteractionOfSelection;
import experimentOntology.planning.threats.InteractionOfTesting;
import experimentOntology.planning.threats.InteractionWithSelection;
import experimentOntology.planning.threats.InteractionWithSetting;
import experimentOntology.planning.threats.InternalThreat;
import experimentOntology.planning.threats.LowStatisticalPower;
import experimentOntology.planning.threats.Maturation;
import experimentOntology.planning.threats.MitigationAction;
import experimentOntology.planning.threats.MonoMethodBias;
import experimentOntology.planning.threats.MonoOperationBias;
import experimentOntology.planning.threats.Mortality;
import experimentOntology.planning.threats.RandomHeteriogenity;
import experimentOntology.planning.threats.RandomIrrelevance;
import experimentOntology.planning.threats.RelialibilityOfMeasures;
import experimentOntology.planning.threats.RelizabilityOfTreatment;
import experimentOntology.planning.threats.ResentfulDemoralization;
import experimentOntology.planning.threats.RestrictedGeneralization;
import experimentOntology.planning.threats.Selection;
import experimentOntology.planning.threats.StatisticalRegretion;
import experimentOntology.planning.threats.Threat;
import experimentOntology.planning.threats.Threats;
import experimentOntology.planning.threats.ThreatsFactory;
import experimentOntology.planning.threats.ThreatsPackage;
import experimentOntology.planning.threats.ViolatedAssumption;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThreatsPackageImpl extends EPackageImpl implements ThreatsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threatsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalThreatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conclusionThreatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructTreatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalThreatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffusionOfImitationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mortalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ambiguityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionWithSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instrumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maturationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resentfulDemoralizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statisticalRegretionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compensatoryRivalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionWithSettingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionOfHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionOfSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relialibilityOfMeasuresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lowStatisticalPowerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relizabilityOfTreatmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass randomIrrelevanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fishingAndErrorRateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass violatedAssumptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass randomHeteriogenityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inadequadePreoperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimenterExpectationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictedGeneralizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionOfTestingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hipothesisGuessingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationAppreensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monoMethodBiasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confoundingConstructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monoOperationBiasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionOfDifferentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mitigationActionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see experimentOntology.planning.threats.ThreatsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ThreatsPackageImpl() {
		super(eNS_URI, ThreatsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ThreatsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ThreatsPackage init() {
		if (isInited) return (ThreatsPackage)EPackage.Registry.INSTANCE.getEPackage(ThreatsPackage.eNS_URI);

		// Obtain or create and register package
		ThreatsPackageImpl theThreatsPackage = (ThreatsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ThreatsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ThreatsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CodingExperimentOntologyPackageImpl theCodingExperimentOntologyPackage = (CodingExperimentOntologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CodingExperimentOntologyPackage.eNS_URI) instanceof CodingExperimentOntologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CodingExperimentOntologyPackage.eNS_URI) : CodingExperimentOntologyPackage.eINSTANCE);
		NewPackage1PackageImpl theNewPackage1Package = (NewPackage1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NewPackage1Package.eNS_URI) instanceof NewPackage1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NewPackage1Package.eNS_URI) : NewPackage1Package.eINSTANCE);
		NewPackage2PackageImpl theNewPackage2Package = (NewPackage2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NewPackage2Package.eNS_URI) instanceof NewPackage2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NewPackage2Package.eNS_URI) : NewPackage2Package.eINSTANCE);
		NewPackage3PackageImpl theNewPackage3Package = (NewPackage3PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NewPackage3Package.eNS_URI) instanceof NewPackage3PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NewPackage3Package.eNS_URI) : NewPackage3Package.eINSTANCE);
		NewPackage4PackageImpl theNewPackage4Package = (NewPackage4PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NewPackage4Package.eNS_URI) instanceof NewPackage4PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NewPackage4Package.eNS_URI) : NewPackage4Package.eINSTANCE);
		ExperimentOntologyPackageImpl theExperimentOntologyPackage = (ExperimentOntologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExperimentOntologyPackage.eNS_URI) instanceof ExperimentOntologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExperimentOntologyPackage.eNS_URI) : ExperimentOntologyPackage.eINSTANCE);
		DescriptionPackageImpl theDescriptionPackage = (DescriptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI) instanceof DescriptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI) : DescriptionPackage.eINSTANCE);
		GqmPackageImpl theGqmPackage = (GqmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GqmPackage.eNS_URI) instanceof GqmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GqmPackage.eNS_URI) : GqmPackage.eINSTANCE);
		PlanningPackageImpl thePlanningPackage = (PlanningPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PlanningPackage.eNS_URI) instanceof PlanningPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PlanningPackage.eNS_URI) : PlanningPackage.eINSTANCE);
		SamplingPackageImpl theSamplingPackage = (SamplingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SamplingPackage.eNS_URI) instanceof SamplingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SamplingPackage.eNS_URI) : SamplingPackage.eINSTANCE);
		DesignOfExperimentPackageImpl theDesignOfExperimentPackage = (DesignOfExperimentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DesignOfExperimentPackage.eNS_URI) instanceof DesignOfExperimentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DesignOfExperimentPackage.eNS_URI) : DesignOfExperimentPackage.eINSTANCE);
		OperationPackageImpl theOperationPackage = (OperationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationPackage.eNS_URI) instanceof OperationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationPackage.eNS_URI) : OperationPackage.eINSTANCE);
		TaskCompositionFrameworkPackageImpl theTaskCompositionFrameworkPackage = (TaskCompositionFrameworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskCompositionFrameworkPackage.eNS_URI) instanceof TaskCompositionFrameworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskCompositionFrameworkPackage.eNS_URI) : TaskCompositionFrameworkPackage.eINSTANCE);

		// Create package meta-data objects
		theThreatsPackage.createPackageContents();
		theCodingExperimentOntologyPackage.createPackageContents();
		theNewPackage1Package.createPackageContents();
		theNewPackage2Package.createPackageContents();
		theNewPackage3Package.createPackageContents();
		theNewPackage4Package.createPackageContents();
		theExperimentOntologyPackage.createPackageContents();
		theDescriptionPackage.createPackageContents();
		theGqmPackage.createPackageContents();
		thePlanningPackage.createPackageContents();
		theSamplingPackage.createPackageContents();
		theDesignOfExperimentPackage.createPackageContents();
		theOperationPackage.createPackageContents();
		theTaskCompositionFrameworkPackage.createPackageContents();

		// Initialize created meta-data
		theThreatsPackage.initializePackageContents();
		theCodingExperimentOntologyPackage.initializePackageContents();
		theNewPackage1Package.initializePackageContents();
		theNewPackage2Package.initializePackageContents();
		theNewPackage3Package.initializePackageContents();
		theNewPackage4Package.initializePackageContents();
		theExperimentOntologyPackage.initializePackageContents();
		theDescriptionPackage.initializePackageContents();
		theGqmPackage.initializePackageContents();
		thePlanningPackage.initializePackageContents();
		theSamplingPackage.initializePackageContents();
		theDesignOfExperimentPackage.initializePackageContents();
		theOperationPackage.initializePackageContents();
		theTaskCompositionFrameworkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theThreatsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ThreatsPackage.eNS_URI, theThreatsPackage);
		return theThreatsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreats() {
		return threatsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThreats_Threat() {
		return (EReference)threatsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreat() {
		return threatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThreat_Action() {
		return (EReference)threatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalThreat() {
		return internalThreatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConclusionThreat() {
		return conclusionThreatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructTreat() {
		return constructTreatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalThreat() {
		return externalThreatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffusionOfImitation() {
		return diffusionOfImitationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMortality() {
		return mortalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistory() {
		return historyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmbiguity() {
		return ambiguityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionWithSelection() {
		return interactionWithSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelection() {
		return selectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstrumentation() {
		return instrumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaturation() {
		return maturationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResentfulDemoralization() {
		return resentfulDemoralizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatisticalRegretion() {
		return statisticalRegretionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompensatoryRivality() {
		return compensatoryRivalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionWithSetting() {
		return interactionWithSettingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionOfHistory() {
		return interactionOfHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionOfSelection() {
		return interactionOfSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelialibilityOfMeasures() {
		return relialibilityOfMeasuresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLowStatisticalPower() {
		return lowStatisticalPowerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelizabilityOfTreatment() {
		return relizabilityOfTreatmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRandomIrrelevance() {
		return randomIrrelevanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFishingAndErrorRate() {
		return fishingAndErrorRateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViolatedAssumption() {
		return violatedAssumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRandomHeteriogenity() {
		return randomHeteriogenityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInadequadePreoperation() {
		return inadequadePreoperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExperimenterExpectation() {
		return experimenterExpectationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestrictedGeneralization() {
		return restrictedGeneralizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionOfTesting() {
		return interactionOfTestingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHipothesisGuessing() {
		return hipothesisGuessingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluationAppreension() {
		return evaluationAppreensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonoMethodBias() {
		return monoMethodBiasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfoundingConstruct() {
		return confoundingConstructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonoOperationBias() {
		return monoOperationBiasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionOfDifferents() {
		return interactionOfDifferentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMitigationAction() {
		return mitigationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreatsFactory getThreatsFactory() {
		return (ThreatsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		threatsEClass = createEClass(THREATS);
		createEReference(threatsEClass, THREATS__THREAT);

		threatEClass = createEClass(THREAT);
		createEReference(threatEClass, THREAT__ACTION);

		internalThreatEClass = createEClass(INTERNAL_THREAT);

		conclusionThreatEClass = createEClass(CONCLUSION_THREAT);

		constructTreatEClass = createEClass(CONSTRUCT_TREAT);

		externalThreatEClass = createEClass(EXTERNAL_THREAT);

		diffusionOfImitationEClass = createEClass(DIFFUSION_OF_IMITATION);

		mortalityEClass = createEClass(MORTALITY);

		historyEClass = createEClass(HISTORY);

		ambiguityEClass = createEClass(AMBIGUITY);

		interactionWithSelectionEClass = createEClass(INTERACTION_WITH_SELECTION);

		selectionEClass = createEClass(SELECTION);

		instrumentationEClass = createEClass(INSTRUMENTATION);

		maturationEClass = createEClass(MATURATION);

		resentfulDemoralizationEClass = createEClass(RESENTFUL_DEMORALIZATION);

		statisticalRegretionEClass = createEClass(STATISTICAL_REGRETION);

		compensatoryRivalityEClass = createEClass(COMPENSATORY_RIVALITY);

		interactionWithSettingEClass = createEClass(INTERACTION_WITH_SETTING);

		interactionOfHistoryEClass = createEClass(INTERACTION_OF_HISTORY);

		interactionOfSelectionEClass = createEClass(INTERACTION_OF_SELECTION);

		relialibilityOfMeasuresEClass = createEClass(RELIALIBILITY_OF_MEASURES);

		lowStatisticalPowerEClass = createEClass(LOW_STATISTICAL_POWER);

		relizabilityOfTreatmentEClass = createEClass(RELIZABILITY_OF_TREATMENT);

		randomIrrelevanceEClass = createEClass(RANDOM_IRRELEVANCE);

		fishingAndErrorRateEClass = createEClass(FISHING_AND_ERROR_RATE);

		violatedAssumptionEClass = createEClass(VIOLATED_ASSUMPTION);

		randomHeteriogenityEClass = createEClass(RANDOM_HETERIOGENITY);

		inadequadePreoperationEClass = createEClass(INADEQUADE_PREOPERATION);

		experimenterExpectationEClass = createEClass(EXPERIMENTER_EXPECTATION);

		restrictedGeneralizationEClass = createEClass(RESTRICTED_GENERALIZATION);

		interactionOfTestingEClass = createEClass(INTERACTION_OF_TESTING);

		hipothesisGuessingEClass = createEClass(HIPOTHESIS_GUESSING);

		evaluationAppreensionEClass = createEClass(EVALUATION_APPREENSION);

		monoMethodBiasEClass = createEClass(MONO_METHOD_BIAS);

		confoundingConstructEClass = createEClass(CONFOUNDING_CONSTRUCT);

		monoOperationBiasEClass = createEClass(MONO_OPERATION_BIAS);

		interactionOfDifferentsEClass = createEClass(INTERACTION_OF_DIFFERENTS);

		mitigationActionEClass = createEClass(MITIGATION_ACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		internalThreatEClass.getESuperTypes().add(this.getThreat());
		conclusionThreatEClass.getESuperTypes().add(this.getThreat());
		constructTreatEClass.getESuperTypes().add(this.getThreat());
		externalThreatEClass.getESuperTypes().add(this.getThreat());
		diffusionOfImitationEClass.getESuperTypes().add(this.getInternalThreat());
		mortalityEClass.getESuperTypes().add(this.getInternalThreat());
		historyEClass.getESuperTypes().add(this.getInternalThreat());
		ambiguityEClass.getESuperTypes().add(this.getInternalThreat());
		interactionWithSelectionEClass.getESuperTypes().add(this.getInternalThreat());
		selectionEClass.getESuperTypes().add(this.getInternalThreat());
		instrumentationEClass.getESuperTypes().add(this.getInternalThreat());
		maturationEClass.getESuperTypes().add(this.getInternalThreat());
		resentfulDemoralizationEClass.getESuperTypes().add(this.getInternalThreat());
		statisticalRegretionEClass.getESuperTypes().add(this.getInternalThreat());
		compensatoryRivalityEClass.getESuperTypes().add(this.getInternalThreat());
		interactionWithSettingEClass.getESuperTypes().add(this.getExternalThreat());
		interactionOfHistoryEClass.getESuperTypes().add(this.getExternalThreat());
		interactionOfSelectionEClass.getESuperTypes().add(this.getExternalThreat());
		relialibilityOfMeasuresEClass.getESuperTypes().add(this.getConclusionThreat());
		lowStatisticalPowerEClass.getESuperTypes().add(this.getConclusionThreat());
		relizabilityOfTreatmentEClass.getESuperTypes().add(this.getConclusionThreat());
		randomIrrelevanceEClass.getESuperTypes().add(this.getConclusionThreat());
		fishingAndErrorRateEClass.getESuperTypes().add(this.getConclusionThreat());
		violatedAssumptionEClass.getESuperTypes().add(this.getConclusionThreat());
		randomHeteriogenityEClass.getESuperTypes().add(this.getConclusionThreat());
		inadequadePreoperationEClass.getESuperTypes().add(this.getConstructTreat());
		experimenterExpectationEClass.getESuperTypes().add(this.getConstructTreat());
		restrictedGeneralizationEClass.getESuperTypes().add(this.getConstructTreat());
		interactionOfTestingEClass.getESuperTypes().add(this.getConstructTreat());
		hipothesisGuessingEClass.getESuperTypes().add(this.getConstructTreat());
		evaluationAppreensionEClass.getESuperTypes().add(this.getConstructTreat());
		monoMethodBiasEClass.getESuperTypes().add(this.getConstructTreat());
		confoundingConstructEClass.getESuperTypes().add(this.getConstructTreat());
		monoOperationBiasEClass.getESuperTypes().add(this.getConstructTreat());
		interactionOfDifferentsEClass.getESuperTypes().add(this.getConstructTreat());

		// Initialize classes, features, and operations; add parameters
		initEClass(threatsEClass, Threats.class, "Threats", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThreats_Threat(), this.getThreat(), null, "threat", null, 0, -1, Threats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(threatEClass, Threat.class, "Threat", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThreat_Action(), this.getMitigationAction(), null, "action", null, 0, -1, Threat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalThreatEClass, InternalThreat.class, "InternalThreat", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conclusionThreatEClass, ConclusionThreat.class, "ConclusionThreat", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constructTreatEClass, ConstructTreat.class, "ConstructTreat", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalThreatEClass, ExternalThreat.class, "ExternalThreat", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(diffusionOfImitationEClass, DiffusionOfImitation.class, "DiffusionOfImitation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mortalityEClass, Mortality.class, "Mortality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(historyEClass, History.class, "History", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ambiguityEClass, Ambiguity.class, "Ambiguity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactionWithSelectionEClass, InteractionWithSelection.class, "InteractionWithSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectionEClass, Selection.class, "Selection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instrumentationEClass, Instrumentation.class, "Instrumentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(maturationEClass, Maturation.class, "Maturation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resentfulDemoralizationEClass, ResentfulDemoralization.class, "ResentfulDemoralization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statisticalRegretionEClass, StatisticalRegretion.class, "StatisticalRegretion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compensatoryRivalityEClass, CompensatoryRivality.class, "CompensatoryRivality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactionWithSettingEClass, InteractionWithSetting.class, "InteractionWithSetting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactionOfHistoryEClass, InteractionOfHistory.class, "InteractionOfHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactionOfSelectionEClass, InteractionOfSelection.class, "InteractionOfSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relialibilityOfMeasuresEClass, RelialibilityOfMeasures.class, "RelialibilityOfMeasures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lowStatisticalPowerEClass, LowStatisticalPower.class, "LowStatisticalPower", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relizabilityOfTreatmentEClass, RelizabilityOfTreatment.class, "RelizabilityOfTreatment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(randomIrrelevanceEClass, RandomIrrelevance.class, "RandomIrrelevance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fishingAndErrorRateEClass, FishingAndErrorRate.class, "FishingAndErrorRate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(violatedAssumptionEClass, ViolatedAssumption.class, "ViolatedAssumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(randomHeteriogenityEClass, RandomHeteriogenity.class, "RandomHeteriogenity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inadequadePreoperationEClass, InadequadePreoperation.class, "InadequadePreoperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(experimenterExpectationEClass, ExperimenterExpectation.class, "ExperimenterExpectation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(restrictedGeneralizationEClass, RestrictedGeneralization.class, "RestrictedGeneralization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactionOfTestingEClass, InteractionOfTesting.class, "InteractionOfTesting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hipothesisGuessingEClass, HipothesisGuessing.class, "HipothesisGuessing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evaluationAppreensionEClass, EvaluationAppreension.class, "EvaluationAppreension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(monoMethodBiasEClass, MonoMethodBias.class, "MonoMethodBias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(confoundingConstructEClass, ConfoundingConstruct.class, "ConfoundingConstruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(monoOperationBiasEClass, MonoOperationBias.class, "MonoOperationBias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactionOfDifferentsEClass, InteractionOfDifferents.class, "InteractionOfDifferents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mitigationActionEClass, MitigationAction.class, "MitigationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ThreatsPackageImpl
