/**
 */
package codingExperimentOntology.threats.impl;

import codingExperimentOntology.CodingExperimentOntologyPackage;

import codingExperimentOntology.apparatus.NewPackage4Package;

import codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl;

import codingExperimentOntology.impl.CodingExperimentOntologyPackageImpl;

import codingExperimentOntology.tasks.NewPackage2Package;

import codingExperimentOntology.tasks.impl.NewPackage2PackageImpl;

import codingExperimentOntology.threats.Ability;
import codingExperimentOntology.threats.AskableMitigation;
import codingExperimentOntology.threats.AvaluationApprehension;
import codingExperimentOntology.threats.ColorBlind;
import codingExperimentOntology.threats.ContentOfStudyObject;
import codingExperimentOntology.threats.ContexRelated;
import codingExperimentOntology.threats.Culture;
import codingExperimentOntology.threats.DataConsistency;
import codingExperimentOntology.threats.DomainKnolegment;
import codingExperimentOntology.threats.Education;
import codingExperimentOntology.threats.Fadigue;
import codingExperimentOntology.threats.FamiliarityWithObject;
import codingExperimentOntology.threats.FamiliarityWithTool;
import codingExperimentOntology.threats.Gender;
import codingExperimentOntology.threats.GenericMitigable;
import codingExperimentOntology.threats.GenericMitigation;
import codingExperimentOntology.threats.HawthroneEffect;
import codingExperimentOntology.threats.IndividualBackground;
import codingExperimentOntology.threats.IndividualKnolegment;
import codingExperimentOntology.threats.Instrumentation;
import codingExperimentOntology.threats.Inteligence;
import codingExperimentOntology.threats.Language;
import codingExperimentOntology.threats.LayoutStudyObject;
import codingExperimentOntology.threats.LearningEffects;
import codingExperimentOntology.threats.MitigatingByAsking;
import codingExperimentOntology.threats.MitigatingByReviewing;
import codingExperimentOntology.threats.MonoMethodBias;
import codingExperimentOntology.threats.MonoOperationBias;
import codingExperimentOntology.threats.Mortality;
import codingExperimentOntology.threats.Motivation;
import codingExperimentOntology.threats.NewEClass36;
import codingExperimentOntology.threats.NewPackage3Factory;
import codingExperimentOntology.threats.NewPackage3Package;
import codingExperimentOntology.threats.Ordering;
import codingExperimentOntology.threats.ProcessConformance;
import codingExperimentOntology.threats.ProgrammingExperience;
import codingExperimentOntology.threats.ReadingTime;
import codingExperimentOntology.threats.ReviewableMitigation;
import codingExperimentOntology.threats.Rosenthal;
import codingExperimentOntology.threats.Selection;
import codingExperimentOntology.threats.SizeOfStudyObjects;
import codingExperimentOntology.threats.StudyObjectCoverange;
import codingExperimentOntology.threats.StudyObjectRelated;
import codingExperimentOntology.threats.SubjectRelated;
import codingExperimentOntology.threats.Tasks;
import codingExperimentOntology.threats.TechinicalProblem;
import codingExperimentOntology.threats.Technical;
import codingExperimentOntology.threats.TiesToPersistMemory;
import codingExperimentOntology.threats.TimePressure;
import codingExperimentOntology.threats.TreatmentPreference;
import codingExperimentOntology.threats.VisualEffort;

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

import experimentOntology.planning.threats.ThreatsPackage;

import experimentOntology.planning.threats.impl.ThreatsPackageImpl;

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
public class NewPackage3PackageImpl extends EPackageImpl implements NewPackage3Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualBackgroundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualKnolegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectRelatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technicalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studyObjectRelatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inteligenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorBlindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cultureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familiarityWithObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainKnolegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programmingExperienceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readingTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fadigueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treatmentPreferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass educationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familiarityWithToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avaluationApprehensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hawthroneEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processConformanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studyObjectCoverangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tiesToPersistMemoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timePressureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualEffortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataConsistencyEClass = null;

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
	private EClass monoOperationBiasEClass = null;

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
	private EClass techinicalProblemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contexRelatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass learningEffectsEClass = null;

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
	private EClass newEClass36EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosenthalEClass = null;

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
	private EClass contentOfStudyObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutStudyObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sizeOfStudyObjectsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tasksEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericMitigableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reviewableMitigationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass askableMitigationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericMitigationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mitigatingByAskingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mitigatingByReviewingEClass = null;

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
	 * @see codingExperimentOntology.threats.NewPackage3Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NewPackage3PackageImpl() {
		super(eNS_URI, NewPackage3Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NewPackage3Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NewPackage3Package init() {
		if (isInited) return (NewPackage3Package)EPackage.Registry.INSTANCE.getEPackage(NewPackage3Package.eNS_URI);

		// Obtain or create and register package
		NewPackage3PackageImpl theNewPackage3Package = (NewPackage3PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NewPackage3PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NewPackage3PackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CodingExperimentOntologyPackageImpl theCodingExperimentOntologyPackage = (CodingExperimentOntologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CodingExperimentOntologyPackage.eNS_URI) instanceof CodingExperimentOntologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CodingExperimentOntologyPackage.eNS_URI) : CodingExperimentOntologyPackage.eINSTANCE);
		NewPackage1PackageImpl theNewPackage1Package = (NewPackage1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NewPackage1Package.eNS_URI) instanceof NewPackage1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NewPackage1Package.eNS_URI) : NewPackage1Package.eINSTANCE);
		NewPackage2PackageImpl theNewPackage2Package = (NewPackage2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NewPackage2Package.eNS_URI) instanceof NewPackage2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NewPackage2Package.eNS_URI) : NewPackage2Package.eINSTANCE);
		NewPackage4PackageImpl theNewPackage4Package = (NewPackage4PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NewPackage4Package.eNS_URI) instanceof NewPackage4PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NewPackage4Package.eNS_URI) : NewPackage4Package.eINSTANCE);
		ExperimentOntologyPackageImpl theExperimentOntologyPackage = (ExperimentOntologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExperimentOntologyPackage.eNS_URI) instanceof ExperimentOntologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExperimentOntologyPackage.eNS_URI) : ExperimentOntologyPackage.eINSTANCE);
		DescriptionPackageImpl theDescriptionPackage = (DescriptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI) instanceof DescriptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI) : DescriptionPackage.eINSTANCE);
		GqmPackageImpl theGqmPackage = (GqmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GqmPackage.eNS_URI) instanceof GqmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GqmPackage.eNS_URI) : GqmPackage.eINSTANCE);
		PlanningPackageImpl thePlanningPackage = (PlanningPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PlanningPackage.eNS_URI) instanceof PlanningPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PlanningPackage.eNS_URI) : PlanningPackage.eINSTANCE);
		ThreatsPackageImpl theThreatsPackage = (ThreatsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ThreatsPackage.eNS_URI) instanceof ThreatsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ThreatsPackage.eNS_URI) : ThreatsPackage.eINSTANCE);
		SamplingPackageImpl theSamplingPackage = (SamplingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SamplingPackage.eNS_URI) instanceof SamplingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SamplingPackage.eNS_URI) : SamplingPackage.eINSTANCE);
		DesignOfExperimentPackageImpl theDesignOfExperimentPackage = (DesignOfExperimentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DesignOfExperimentPackage.eNS_URI) instanceof DesignOfExperimentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DesignOfExperimentPackage.eNS_URI) : DesignOfExperimentPackage.eINSTANCE);
		OperationPackageImpl theOperationPackage = (OperationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationPackage.eNS_URI) instanceof OperationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationPackage.eNS_URI) : OperationPackage.eINSTANCE);
		TaskCompositionFrameworkPackageImpl theTaskCompositionFrameworkPackage = (TaskCompositionFrameworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskCompositionFrameworkPackage.eNS_URI) instanceof TaskCompositionFrameworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskCompositionFrameworkPackage.eNS_URI) : TaskCompositionFrameworkPackage.eINSTANCE);

		// Create package meta-data objects
		theNewPackage3Package.createPackageContents();
		theCodingExperimentOntologyPackage.createPackageContents();
		theNewPackage1Package.createPackageContents();
		theNewPackage2Package.createPackageContents();
		theNewPackage4Package.createPackageContents();
		theExperimentOntologyPackage.createPackageContents();
		theDescriptionPackage.createPackageContents();
		theGqmPackage.createPackageContents();
		thePlanningPackage.createPackageContents();
		theThreatsPackage.createPackageContents();
		theSamplingPackage.createPackageContents();
		theDesignOfExperimentPackage.createPackageContents();
		theOperationPackage.createPackageContents();
		theTaskCompositionFrameworkPackage.createPackageContents();

		// Initialize created meta-data
		theNewPackage3Package.initializePackageContents();
		theCodingExperimentOntologyPackage.initializePackageContents();
		theNewPackage1Package.initializePackageContents();
		theNewPackage2Package.initializePackageContents();
		theNewPackage4Package.initializePackageContents();
		theExperimentOntologyPackage.initializePackageContents();
		theDescriptionPackage.initializePackageContents();
		theGqmPackage.initializePackageContents();
		thePlanningPackage.initializePackageContents();
		theThreatsPackage.initializePackageContents();
		theSamplingPackage.initializePackageContents();
		theDesignOfExperimentPackage.initializePackageContents();
		theOperationPackage.initializePackageContents();
		theTaskCompositionFrameworkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNewPackage3Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NewPackage3Package.eNS_URI, theNewPackage3Package);
		return theNewPackage3Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividualBackground() {
		return individualBackgroundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividualKnolegment() {
		return individualKnolegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubjectRelated() {
		return subjectRelatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechnical() {
		return technicalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudyObjectRelated() {
		return studyObjectRelatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGender() {
		return genderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteligence() {
		return inteligenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorBlind() {
		return colorBlindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCulture() {
		return cultureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbility() {
		return abilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamiliarityWithObject() {
		return familiarityWithObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainKnolegment() {
		return domainKnolegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgrammingExperience() {
		return programmingExperienceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadingTime() {
		return readingTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFadigue() {
		return fadigueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotivation() {
		return motivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTreatmentPreference() {
		return treatmentPreferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEducation() {
		return educationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamiliarityWithTool() {
		return familiarityWithToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvaluationApprehension() {
		return avaluationApprehensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHawthroneEffect() {
		return hawthroneEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessConformance() {
		return processConformanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudyObjectCoverange() {
		return studyObjectCoverangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTiesToPersistMemory() {
		return tiesToPersistMemoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimePressure() {
		return timePressureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisualEffort() {
		return visualEffortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataConsistency() {
		return dataConsistencyEClass;
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
	public EClass getMonoOperationBias() {
		return monoOperationBiasEClass;
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
	public EClass getTechinicalProblem() {
		return techinicalProblemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContexRelated() {
		return contexRelatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLearningEffects() {
		return learningEffectsEClass;
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
	public EClass getNewEClass36() {
		return newEClass36EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrdering() {
		return orderingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRosenthal() {
		return rosenthalEClass;
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
	public EClass getContentOfStudyObject() {
		return contentOfStudyObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguage() {
		return languageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayoutStudyObject() {
		return layoutStudyObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSizeOfStudyObjects() {
		return sizeOfStudyObjectsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTasks() {
		return tasksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericMitigable() {
		return genericMitigableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericMitigable_GeneralActions() {
		return (EReference)genericMitigableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReviewableMitigation() {
		return reviewableMitigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReviewableMitigation_Actions() {
		return (EReference)reviewableMitigationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAskableMitigation() {
		return askableMitigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAskableMitigation_Actions() {
		return (EReference)askableMitigationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericMitigation() {
		return genericMitigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMitigatingByAsking() {
		return mitigatingByAskingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMitigatingByAsking_Question() {
		return (EReference)mitigatingByAskingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMitigatingByReviewing() {
		return mitigatingByReviewingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewPackage3Factory getNewPackage3Factory() {
		return (NewPackage3Factory)getEFactoryInstance();
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
		individualBackgroundEClass = createEClass(INDIVIDUAL_BACKGROUND);

		individualKnolegmentEClass = createEClass(INDIVIDUAL_KNOLEGMENT);

		subjectRelatedEClass = createEClass(SUBJECT_RELATED);

		technicalEClass = createEClass(TECHNICAL);

		studyObjectRelatedEClass = createEClass(STUDY_OBJECT_RELATED);

		genderEClass = createEClass(GENDER);

		inteligenceEClass = createEClass(INTELIGENCE);

		colorBlindEClass = createEClass(COLOR_BLIND);

		cultureEClass = createEClass(CULTURE);

		abilityEClass = createEClass(ABILITY);

		familiarityWithObjectEClass = createEClass(FAMILIARITY_WITH_OBJECT);

		domainKnolegmentEClass = createEClass(DOMAIN_KNOLEGMENT);

		programmingExperienceEClass = createEClass(PROGRAMMING_EXPERIENCE);

		readingTimeEClass = createEClass(READING_TIME);

		fadigueEClass = createEClass(FADIGUE);

		motivationEClass = createEClass(MOTIVATION);

		treatmentPreferenceEClass = createEClass(TREATMENT_PREFERENCE);

		educationEClass = createEClass(EDUCATION);

		familiarityWithToolEClass = createEClass(FAMILIARITY_WITH_TOOL);

		avaluationApprehensionEClass = createEClass(AVALUATION_APPREHENSION);

		hawthroneEffectEClass = createEClass(HAWTHRONE_EFFECT);

		processConformanceEClass = createEClass(PROCESS_CONFORMANCE);

		studyObjectCoverangeEClass = createEClass(STUDY_OBJECT_COVERANGE);

		tiesToPersistMemoryEClass = createEClass(TIES_TO_PERSIST_MEMORY);

		timePressureEClass = createEClass(TIME_PRESSURE);

		visualEffortEClass = createEClass(VISUAL_EFFORT);

		dataConsistencyEClass = createEClass(DATA_CONSISTENCY);

		instrumentationEClass = createEClass(INSTRUMENTATION);

		monoOperationBiasEClass = createEClass(MONO_OPERATION_BIAS);

		monoMethodBiasEClass = createEClass(MONO_METHOD_BIAS);

		techinicalProblemEClass = createEClass(TECHINICAL_PROBLEM);

		contexRelatedEClass = createEClass(CONTEX_RELATED);

		learningEffectsEClass = createEClass(LEARNING_EFFECTS);

		mortalityEClass = createEClass(MORTALITY);

		newEClass36EClass = createEClass(NEW_ECLASS36);

		orderingEClass = createEClass(ORDERING);

		rosenthalEClass = createEClass(ROSENTHAL);

		selectionEClass = createEClass(SELECTION);

		contentOfStudyObjectEClass = createEClass(CONTENT_OF_STUDY_OBJECT);

		languageEClass = createEClass(LANGUAGE);

		layoutStudyObjectEClass = createEClass(LAYOUT_STUDY_OBJECT);

		sizeOfStudyObjectsEClass = createEClass(SIZE_OF_STUDY_OBJECTS);

		tasksEClass = createEClass(TASKS);

		genericMitigableEClass = createEClass(GENERIC_MITIGABLE);
		createEReference(genericMitigableEClass, GENERIC_MITIGABLE__GENERAL_ACTIONS);

		reviewableMitigationEClass = createEClass(REVIEWABLE_MITIGATION);
		createEReference(reviewableMitigationEClass, REVIEWABLE_MITIGATION__ACTIONS);

		askableMitigationEClass = createEClass(ASKABLE_MITIGATION);
		createEReference(askableMitigationEClass, ASKABLE_MITIGATION__ACTIONS);

		genericMitigationEClass = createEClass(GENERIC_MITIGATION);

		mitigatingByAskingEClass = createEClass(MITIGATING_BY_ASKING);
		createEReference(mitigatingByAskingEClass, MITIGATING_BY_ASKING__QUESTION);

		mitigatingByReviewingEClass = createEClass(MITIGATING_BY_REVIEWING);
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

		// Obtain other dependent packages
		ThreatsPackage theThreatsPackage = (ThreatsPackage)EPackage.Registry.INSTANCE.getEPackage(ThreatsPackage.eNS_URI);
		NewPackage4Package theNewPackage4Package = (NewPackage4Package)EPackage.Registry.INSTANCE.getEPackage(NewPackage4Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		individualBackgroundEClass.getESuperTypes().add(theThreatsPackage.getThreat());
		individualKnolegmentEClass.getESuperTypes().add(theThreatsPackage.getThreat());
		subjectRelatedEClass.getESuperTypes().add(theThreatsPackage.getThreat());
		technicalEClass.getESuperTypes().add(theThreatsPackage.getThreat());
		studyObjectRelatedEClass.getESuperTypes().add(theThreatsPackage.getThreat());
		genderEClass.getESuperTypes().add(this.getIndividualBackground());
		inteligenceEClass.getESuperTypes().add(this.getIndividualBackground());
		colorBlindEClass.getESuperTypes().add(this.getIndividualBackground());
		cultureEClass.getESuperTypes().add(this.getIndividualBackground());
		abilityEClass.getESuperTypes().add(this.getIndividualKnolegment());
		familiarityWithObjectEClass.getESuperTypes().add(this.getIndividualKnolegment());
		domainKnolegmentEClass.getESuperTypes().add(this.getIndividualKnolegment());
		readingTimeEClass.getESuperTypes().add(this.getIndividualKnolegment());
		fadigueEClass.getESuperTypes().add(this.getIndividualKnolegment());
		motivationEClass.getESuperTypes().add(this.getIndividualKnolegment());
		treatmentPreferenceEClass.getESuperTypes().add(this.getIndividualKnolegment());
		educationEClass.getESuperTypes().add(this.getIndividualKnolegment());
		familiarityWithToolEClass.getESuperTypes().add(this.getIndividualKnolegment());
		avaluationApprehensionEClass.getESuperTypes().add(this.getSubjectRelated());
		hawthroneEffectEClass.getESuperTypes().add(this.getSubjectRelated());
		processConformanceEClass.getESuperTypes().add(this.getSubjectRelated());
		studyObjectCoverangeEClass.getESuperTypes().add(this.getSubjectRelated());
		tiesToPersistMemoryEClass.getESuperTypes().add(this.getSubjectRelated());
		timePressureEClass.getESuperTypes().add(this.getSubjectRelated());
		visualEffortEClass.getESuperTypes().add(this.getSubjectRelated());
		dataConsistencyEClass.getESuperTypes().add(this.getTechnical());
		instrumentationEClass.getESuperTypes().add(this.getTechnical());
		monoOperationBiasEClass.getESuperTypes().add(this.getTechnical());
		monoMethodBiasEClass.getESuperTypes().add(this.getTechnical());
		techinicalProblemEClass.getESuperTypes().add(this.getTechnical());
		learningEffectsEClass.getESuperTypes().add(this.getContexRelated());
		mortalityEClass.getESuperTypes().add(this.getContexRelated());
		newEClass36EClass.getESuperTypes().add(this.getContexRelated());
		orderingEClass.getESuperTypes().add(this.getContexRelated());
		rosenthalEClass.getESuperTypes().add(this.getContexRelated());
		selectionEClass.getESuperTypes().add(this.getContexRelated());
		contentOfStudyObjectEClass.getESuperTypes().add(this.getStudyObjectRelated());
		languageEClass.getESuperTypes().add(this.getStudyObjectRelated());
		layoutStudyObjectEClass.getESuperTypes().add(this.getStudyObjectRelated());
		sizeOfStudyObjectsEClass.getESuperTypes().add(this.getStudyObjectRelated());
		tasksEClass.getESuperTypes().add(this.getStudyObjectRelated());
		reviewableMitigationEClass.getESuperTypes().add(this.getGenericMitigable());
		askableMitigationEClass.getESuperTypes().add(this.getGenericMitigable());

		// Initialize classes, features, and operations; add parameters
		initEClass(individualBackgroundEClass, IndividualBackground.class, "IndividualBackground", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(individualKnolegmentEClass, IndividualKnolegment.class, "IndividualKnolegment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subjectRelatedEClass, SubjectRelated.class, "SubjectRelated", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(technicalEClass, Technical.class, "Technical", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(studyObjectRelatedEClass, StudyObjectRelated.class, "StudyObjectRelated", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genderEClass, Gender.class, "Gender", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inteligenceEClass, Inteligence.class, "Inteligence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(colorBlindEClass, ColorBlind.class, "ColorBlind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cultureEClass, Culture.class, "Culture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abilityEClass, Ability.class, "Ability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(familiarityWithObjectEClass, FamiliarityWithObject.class, "FamiliarityWithObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainKnolegmentEClass, DomainKnolegment.class, "DomainKnolegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(programmingExperienceEClass, ProgrammingExperience.class, "ProgrammingExperience", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(readingTimeEClass, ReadingTime.class, "ReadingTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fadigueEClass, Fadigue.class, "Fadigue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(motivationEClass, Motivation.class, "Motivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(treatmentPreferenceEClass, TreatmentPreference.class, "TreatmentPreference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(educationEClass, Education.class, "Education", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(familiarityWithToolEClass, FamiliarityWithTool.class, "FamiliarityWithTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(avaluationApprehensionEClass, AvaluationApprehension.class, "AvaluationApprehension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hawthroneEffectEClass, HawthroneEffect.class, "HawthroneEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processConformanceEClass, ProcessConformance.class, "ProcessConformance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(studyObjectCoverangeEClass, StudyObjectCoverange.class, "StudyObjectCoverange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tiesToPersistMemoryEClass, TiesToPersistMemory.class, "TiesToPersistMemory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timePressureEClass, TimePressure.class, "TimePressure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(visualEffortEClass, VisualEffort.class, "VisualEffort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataConsistencyEClass, DataConsistency.class, "DataConsistency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instrumentationEClass, Instrumentation.class, "Instrumentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(monoOperationBiasEClass, MonoOperationBias.class, "MonoOperationBias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(monoMethodBiasEClass, MonoMethodBias.class, "MonoMethodBias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(techinicalProblemEClass, TechinicalProblem.class, "TechinicalProblem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contexRelatedEClass, ContexRelated.class, "ContexRelated", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(learningEffectsEClass, LearningEffects.class, "LearningEffects", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mortalityEClass, Mortality.class, "Mortality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(newEClass36EClass, NewEClass36.class, "NewEClass36", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orderingEClass, Ordering.class, "Ordering", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rosenthalEClass, Rosenthal.class, "Rosenthal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectionEClass, Selection.class, "Selection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contentOfStudyObjectEClass, ContentOfStudyObject.class, "ContentOfStudyObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(languageEClass, Language.class, "Language", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(layoutStudyObjectEClass, LayoutStudyObject.class, "LayoutStudyObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sizeOfStudyObjectsEClass, SizeOfStudyObjects.class, "SizeOfStudyObjects", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tasksEClass, Tasks.class, "Tasks", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genericMitigableEClass, GenericMitigable.class, "GenericMitigable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenericMitigable_GeneralActions(), this.getGenericMitigation(), null, "generalActions", null, 0, -1, GenericMitigable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reviewableMitigationEClass, ReviewableMitigation.class, "ReviewableMitigation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReviewableMitigation_Actions(), this.getMitigatingByReviewing(), null, "actions", null, 0, -1, ReviewableMitigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(askableMitigationEClass, AskableMitigation.class, "AskableMitigation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAskableMitigation_Actions(), this.getMitigatingByAsking(), null, "actions", null, 0, -1, AskableMitigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericMitigationEClass, GenericMitigation.class, "GenericMitigation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mitigatingByAskingEClass, MitigatingByAsking.class, "MitigatingByAsking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMitigatingByAsking_Question(), theNewPackage4Package.getQuestion(), null, "question", null, 1, -1, MitigatingByAsking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mitigatingByReviewingEClass, MitigatingByReviewing.class, "MitigatingByReviewing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //NewPackage3PackageImpl
