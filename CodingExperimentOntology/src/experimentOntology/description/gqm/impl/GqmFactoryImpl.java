/**
 */
package experimentOntology.description.gqm.impl;

import experimentOntology.description.gqm.*;

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
public class GqmFactoryImpl extends EFactoryImpl implements GqmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GqmFactory init() {
		try {
			GqmFactory theGqmFactory = (GqmFactory)EPackage.Registry.INSTANCE.getEFactory(GqmPackage.eNS_URI);
			if (theGqmFactory != null) {
				return theGqmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GqmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GqmFactoryImpl() {
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
			case GqmPackage.GQM_DESCRIPTION: return createGQMDescription();
			case GqmPackage.GOAL_GQM: return createGoalGQM();
			case GqmPackage.QUESTION_GQM: return createQuestionGQM();
			case GqmPackage.METRIC_GQM: return createMetricGQM();
			case GqmPackage.GOALS: return createGoals();
			case GqmPackage.QUESTIONS: return createQuestions();
			case GqmPackage.METRICS: return createMetrics();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GQMDescription createGQMDescription() {
		GQMDescriptionImpl gqmDescription = new GQMDescriptionImpl();
		return gqmDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalGQM createGoalGQM() {
		GoalGQMImpl goalGQM = new GoalGQMImpl();
		return goalGQM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionGQM createQuestionGQM() {
		QuestionGQMImpl questionGQM = new QuestionGQMImpl();
		return questionGQM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricGQM createMetricGQM() {
		MetricGQMImpl metricGQM = new MetricGQMImpl();
		return metricGQM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goals createGoals() {
		GoalsImpl goals = new GoalsImpl();
		return goals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questions createQuestions() {
		QuestionsImpl questions = new QuestionsImpl();
		return questions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metrics createMetrics() {
		MetricsImpl metrics = new MetricsImpl();
		return metrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GqmPackage getGqmPackage() {
		return (GqmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GqmPackage getPackage() {
		return GqmPackage.eINSTANCE;
	}

} //GqmFactoryImpl
